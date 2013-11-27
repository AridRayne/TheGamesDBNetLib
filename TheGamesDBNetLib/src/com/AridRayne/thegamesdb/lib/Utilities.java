package com.AridRayne.thegamesdb.lib;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.AridRayne.thegamesdb.lib.image.GameImage;

/**
 * A utilities class that helps get information from thegamesdb.net.
 * @author AridRayne
 *
 */
public class Utilities {
	private String developerID;
	private String userAccountID;
	private String apiUrl = "http://thegamesdb.net/api/";
	private String userAgent = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2";
	private static Utilities instance;
	
	/**
	 * Returns an instance of the Utilities singleton.
	 * @return Instance of Utilities singleton.
	 */
	public static Utilities getInstance() {
		if (instance == null)
			instance = new Utilities();
		return instance;
	}
	
	/**
	 * Returns the developer ID that is in use. This is currently unused and is here to future-proof for when thegamesdb.net adds a developer ID requirement.
	 * @return The developer ID.
	 */
	public String getDevID() {
		return this.developerID;
	}

	/**
	 * Sets the developer ID that is in use. This is currently unused and is here to future-proof for when thegamesdb.net adds a developer ID requirement.
	 * @param developerID The developer ID.
	 */
	public void setDeveloperID(String developerID) {
		this.developerID = developerID;
	}

	/**
	 * Returns the user account ID that's being used. Only used for getting/setting favorites and ratings at the moment.
	 * @return The user account ID.
	 */
	public String getUserAccountID() {
		return this.userAccountID;
	}

	/**
	 * Sets the user account ID that's being used. Only used for getting/setting favorites and ratings at the moment.
	 * @param userAccountID The user account ID.
	 */
	public void setUserAccountID(String userAccountID) {
		this.userAccountID = userAccountID;
	}

	/**
	 * Returns the user-agent that is used for making API requests from thegamesdb.net. This is required because the API will deny any request without a user-agent.
	 * @return The user-agent.
	 */
	public String getUserAgent() {
		return this.userAgent;
	}

	/**
	 * Sets the user-agent that is used for making API requests from thegamesdb.net. This is required because the API will deny any request without a user-agent.
	 * @param userAgent The user-agent.
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	private Utilities() {
		this.developerID = "";
		this.userAccountID = "";
		this.userAgent = "";
	}
	
	@SuppressWarnings("unchecked")
	public <T> T apiRequest(String url, T classObject) {
		try {
			URL apiURL = new URL(this.apiUrl + url);
			URLConnection conn = apiURL.openConnection();
			conn.setRequestProperty("User-Agent", this.userAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			classObject = (T) serializer.read(classObject.getClass(), is, false);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classObject;
	}
	
	/**
	 * Returns a Data<Platform> item that contains information about the platform with the specified ID.
	 * @param id The ID of the platform to retrieve.
	 * @return A Data<Platform> item containing information about the platform with the specified ID.
	 */
	public Data<Platform> getPlatform(int id) {
		return apiRequest("GetPlatform.php?id=" + id, new Data<Platform>());
	}
	
	/**
	 * Returns a Data<Game> item that contains information about the game with the specified ID.
	 * @param id The ID of the game to retrieve.
	 * @return A Data<Game> item containing information about the game with the specified ID.
	 */
	public Data<Game> getGame(int id) {
		return apiRequest("GetGame.php?id=" + id, new Data<Game>());
	}
	
	/**
	 * Returns a Data<Game> item that contains information about games with the specified name, this is a search.
	 * @param name The name to search for
	 * @return A Data<Game> item containing information about games with the specified name.
	 */
	public Data<Game> getGame(String name) {
		try {
			return apiRequest("GetGame.php?name=" + URLEncoder.encode(name, "UTF-8"), new Data<Game>());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Returns a Data<Game> item that contains information about games with the specified name, filtered by the specified platform.
	 * PLEASE NOTE: The platform *must* be a valid platform, these can be found by getPlatformList(). The proper platform is the name.
	 * @param name The name to search for.
	 * @param platform The platform to filter by, this must be a valid platform name.
	 * @return
	 */
	public Data<Game> getGame(String name, String platform) {
		try {
			return apiRequest("GetGame.php?name=" + URLEncoder.encode(name, "UTF-8") + "&platform=" + URLEncoder.encode(platform, "UTF-8"), new Data<Game>());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Sets the user's rating of the game with the specified ID. The user is specified by setting the User ID of the Utilities singleton.
	 * @param id The ID of the game to set the rating for.
	 * @param rating The rating to set.
	 * @see setUserID
	 */
	public void setRating(int id, double rating) {
		apiRequest("User_Rating.php?accountid=" + userAccountID + "&itemid=" + id + "&rating=" + rating, null);
	}
	
	/**
	 * Returns the user's rating of the game with the specified ID. The user is specified by setting the User ID of the Utilities singleton. Right now, the API seems to only return the community average rating.
	 * @param id The ID of the game to get the rating for.
	 * @return The user's rating of the game with the specified ID.
	 * @see setUserId
	 */
	public double getRating(int id) {
		return apiRequest("User_Rating.php?accountid=" + userAccountID + "&itemid=" + id, new ratingClass()).getRating();
	}
	
	/**
	 * Returns a list of all platforms in thegamesdb.net database.
	 * @return PlatformList containing a list of all platforms.
	 */
	public PlatformList getPlatformList() {
		return apiRequest("GetPlatformsList.php", new PlatformList());
	}
        
    /**
	 * Returns a list of all platforms in thegamesdb.net database.
	 * @return PlatformList containing a list of all platforms.
	 */
	public GameList getGamesList(String name) {
		try {
			return apiRequest("GetGamesList.php?name=" + URLEncoder.encode(name, "UTF-8"), new GameList());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Adds the game with the specified ID to the user's favorites.
	 * @param id The ID of the game to add to the user's favorites.
	 */
	public void addFavorite(int id) {
		apiRequest("User_Favorites.php?accountid=" + userAccountID + "&type=add&gameid=" + id, null);
	}
	
	/**
	 * Removes the game with the specified ID from the user's favorites.
	 * @param id The ID of the game to remove from the favorites.
	 */
	public void removeFavorite(int id) {
		apiRequest("User_Favorites.php?accountid=" + userAccountID + "&type=remove&gameid=" + id, null);
	}
	
	/**
	 * Returns a UserFavorites item containing a list of the user's favorites.
	 * @return A UserFavorites item containing a list of the user's favorites.
	 */
	public UserFavorites getFavorites() {
		return apiRequest("User_Favorites.php?accountid=" + userAccountID, new UserFavorites());
	}
	
	/**
	 * Returns a Data<GameImage> item containing information about the images for the game with the specified ID.
	 * @param id The ID of the game to retrieve art for.
	 * @return A Data<GameImage> item containing information about the images for the game with the specified ID.
	 */
	public Data<GameImage> getArt(int id) {
		return apiRequest("GetArt.php?id=" + id, new Data<GameImage>());
	}
	
	/**
	 * Returns a list of game IDs for games that have been updated in the last however many seconds specified by the time parameter.
	 * For instance, passing 2,000 as the parameter time will look for games updated in the last 2,000 seconds.
	 * @param time How many seconds back to look for updated games.
	 * @return List of games that have been updated in the last however many seconds specified by the time parameter.
	 */
	public Updates getUpdates(int time) {
		return apiRequest("Updates.php?time=" + time, new Updates());
	}
	
	/**
	 * Returns a PlatformGameItemData item containing information about all the games for the platform with the specified ID.
	 * Please note: the field "thumb" will most likely be null.
	 * @param id The ID of the platform to get the list of games for.
	 * @return A PlatformGameItemData item containing information about all the games for the platform with the specified ID.
	 */
	public PlatformGameItemData getPlatformGames(int id) {
		return apiRequest("GetPlatformGames.php?platform=" + id, new PlatformGameItemData());
	}
	
	/**
	 * Returns a PlatformGameItemData item containing information about all the games for the platform with the specified platform name.
	 * @param platformName The name of the platform to get the list of games for.
	 * @return A PlatformGameItemData item containing information about all the games for the platform with the specified platform name.
	 */
	public PlatformGameItemData getPlatformGames(String platformName) {
		try {
			return apiRequest("PlatformGames.php?platform=" + URLEncoder.encode(platformName, "UTF-8"), new PlatformGameItemData());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Languages getUserPreferredLanguage() {
		return apiRequest("User_PreferredLanguage.php?accountid=" + userAccountID, new Languages());
	}
}