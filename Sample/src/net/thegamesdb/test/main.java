package net.thegamesdb.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.AridRayne.thegamesdb.lib.Data;
import com.AridRayne.thegamesdb.lib.Game;
import com.AridRayne.thegamesdb.lib.GameList;
import com.AridRayne.thegamesdb.lib.Languages;
import com.AridRayne.thegamesdb.lib.Platform;
import com.AridRayne.thegamesdb.lib.PlatformGameItemData;
import com.AridRayne.thegamesdb.lib.PlatformList;
import com.AridRayne.thegamesdb.lib.Updates;
import com.AridRayne.thegamesdb.lib.UserFavorites;
import com.AridRayne.thegamesdb.lib.Utilities;
import com.AridRayne.thegamesdb.lib.image.GameImage;


public class main {

	public static void main(String[] args) throws IOException {
		// Get an instance of the utilities singleton.
		Utilities utilities = Utilities.getInstance();
        // This has no real use in the library itself, this just gets the user account id from standard input and sets it in the Utilities singleton.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter User Account ID: ");
        String accountID = br.readLine();
        utilities.setUserAccountID(accountID);

		// Retrieve a list of platforms from thegamesdb.net
		PlatformList platforms = utilities.getPlatformList();
             
		// Retrieve information about a platform with an id from platforms.
		Data<Platform> platform = utilities.getPlatform(platforms.getItem(0).getId());
		// Print the platform's overview.
		System.out.println(platform.getItem(0).getOverview());

		// Retrieve information about a game with id 2.
		Data<Game> game = Utilities.getInstance().getGame(2);
		// Print the game's title and overview.
		System.out.println(game.getItem(0).getTitle());
        System.out.println(game.getItem(0).getOverview());
        
        // Retrieve a list of games from thegamesdb.net
        GameList games = utilities.getGamesList("Battlefield 2");
        
        Data<Game> gameNameSearch = utilities.getGame("Super Mario");
        System.out.println(gameNameSearch.getItem(0).getTitle());
        
        Data<Game> gamePlatformFilter = utilities.getGame("Super Mario", "Nintendo Entertainment System (NES)");
        System.out.println(gamePlatformFilter.getItem(0).getTitle());
        
        // Retrieve information about a specific game.
        Data<Game> gameItem = utilities.getGame(games.getItem(0).getId());
        // Print the overview of the game.
        System.out.println(gameItem.getItem(0).getTitle());
        System.out.println(gameItem.getItem(0).getOverview());
        
        UserFavorites faves = utilities.getFavorites();
        System.out.println(faves.getGames().size());
        
        Data<GameImage> images = utilities.getArt(2);
        System.out.println(images.getBaseUrl());
        
        Updates updates = utilities.getUpdates(20000);
        System.out.println(updates.getItems().size());
        
        PlatformGameItemData platformGames = utilities.getPlatformGames(1);
        System.out.println(platformGames.getItems().size());
        
        PlatformGameItemData platformGamesFromName = utilities.getPlatformGames("microsoft xbox");
        System.out.println(platformGamesFromName.getItems().size());
        
        Languages languages = utilities.getUserPreferredLanguage();
        System.out.println(languages.getItem(0).getName());
	}
}
