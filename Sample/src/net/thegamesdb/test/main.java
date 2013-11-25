package net.thegamesdb.test;
import com.AridRayne.thegamesdb.lib.Data;
import com.AridRayne.thegamesdb.lib.Game;
import com.AridRayne.thegamesdb.lib.GameList;
import com.AridRayne.thegamesdb.lib.Platform;
import com.AridRayne.thegamesdb.lib.PlatformList;
import com.AridRayne.thegamesdb.lib.Utilities;


public class main {

	public static void main(String[] args) {
		// Get an instance of the utilities singleton.
		Utilities utilities = Utilities.getInstance();
		utilities.setUserId("User Account ID");

		// Retrieve a list of platforms from thegamesdb.net
		PlatformList platforms = utilities.getPlatformList();
             
		// Retrieve information about a platform with an id from platforms.
		Data<Platform> platform = utilities.getPlatformFromID(platforms.getItem(0).getId());
		// Print the platform's overview.
		System.out.println(platform.getItem(0).getOverview());

		// Retrieve information about a game with id 2.
		Data<Game> game = Utilities.getInstance().getGameFromID(2);
		// Print the game's title and overview.
		System.out.println(game.getItem(0).getTitle());
        System.out.println(game.getItem(0).getOverview());
        
        // Retrieve a list of games from thegamesdb.net
        GameList games = utilities.getGamesList("x-men");
        
        // Retrieve information about a specific game.
        Data<Game> gameItem = utilities.getGameFromID(games.getItem(0).getId());
        // Print the overview of the game.
        System.out.println(gameItem.getItem(0).getTitle());
        System.out.println(gameItem.getItem(0).getOverview());
	}

}
