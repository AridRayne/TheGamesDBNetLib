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
	private String devId;
	private String userId;
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
	public String getDevId() {
		return devId;
	}

	/**
	 * Sets the developer ID that is in use. This is currently unused and is here to future-proof for when thegamesdb.net adds a developer ID requirement.
	 * @param devId The developer ID.
	 */
	public void setDevId(String devId) {
		this.devId = devId;
	}

	/**
	 * Returns the user account ID that's being used. Only used for getting/setting favorites and ratings at the moment.
	 * @return The user account ID.
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the user account ID that's being used. Only used for getting/setting favorites and ratings at the moment.
	 * @param userId The user account ID.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Returns the user-agent that is used for making API requests from thegamesdb.net. This is required because the API will deny any request without a user-agent.
	 * @return The user-agent.
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * Sets the user-agent that is used for making API requests from thegamesdb.net. This is required because the API will deny any request without a user-agent.
	 * @param userAgent The user-agent.
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	private Utilities() {
		this.devId = "";
		this.userId = "";
	}
	
	@SuppressWarnings("unchecked")
	public <T> T apiRequest(String url, T ClassObject) {
		try {
			URL apiURL = new URL(apiUrl + url);
			URLConnection conn = apiURL.openConnection();
			conn.setRequestProperty("User-Agent", userAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			ClassObject = (T) serializer.read(ClassObject.getClass(), is, false);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ClassObject;
	}
	
	/**
	 * Returns a Data<Platform> item that contains information about the platform with the specified ID.
	 * @param ID The ID of the platform to retrieve.
	 * @return A Data<Platform> item containing information about the platform with the specified ID.
	 */
	public Data<Platform> getPlatform(int ID) {
		return apiRequest("GetPlatform.php?id=" + ID, new Data<Platform>());
	}
	
	/**
	 * Returns a Data<Game> item that contains information about the game with the specified ID.
	 * @param ID The ID of the game to retrieve.
	 * @return A Data<Game> item containing information about the game with the specified ID.
	 */
	public Data<Game> getGame(int ID) {
		return apiRequest("GetGame.php?id=" + ID, new Data<Game>());
	}
	
	/**
	 * Returns a Data<Game> item that contains information about games with the specified name, this is a search.
	 * @param name The name to search for
	 * @return A Data<Game> item containing information about games with the specified name.
	 */
	public Data<Game> getGame(String Name) {
		try {
			return apiRequest("GetGame.php?name=" + URLEncoder.encode(Name, "UTF-8"), new Data<Game>());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Returns a Data<Game> item that contains information about games with the specified name, filtered by the specified platform.
	 * PLEASE NOTE: The platform *must* be a valid platform, these can be found by getPlatformList(). The proper platform is the name.
	 * @param Name The name to search for.
	 * @param Platform The platform to filter by, this must be a valid platform name.
	 * @return
	 */
	public Data<Game> getGame(String Name, String Platform) {
		try {
			return apiRequest("GetGame.php?name=" + URLEncoder.encode(Name, "UTF-8") + "&platform=" + URLEncoder.encode(Platform, "UTF-8"), new Data<Game>());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
		}
		return null;
	}
	
	/**
	 * Sets the user's rating of the game with the specified ID. The user is specified by setting the User ID of the Utilities singleton.
	 * @param ID The ID of the game to set the rating for.
	 * @param Rating The rating to set.
	 * @see setUserID
	 */
	public void setRating(int ID, double Rating) {
		apiRequest("User_Rating.php?accountid=" + userId + "&itemid=" + ID + "&rating=" + Rating, null);
	}
	
	/**
	 * Returns the user's rating of the game with the specified ID. The user is specified by setting the User ID of the Utilities singleton. Right now, the API seems to only return the community average rating.
	 * @param ID The ID of the game to get the rating for.
	 * @return The user's rating of the game with the specified ID.
	 * @see setUserId
	 */
	public double getRating(int ID) {
		return apiRequest("User_Rating.php?accountid=" + userId + "&itemid=" + ID, new ratingClass()).getRating();
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
		return apiRequest("GetGamesList.php?name=" + name, new GameList());
	}
	
	/**
	 * Adds the game with the specified ID to the user's favorites.
	 * @param ID The ID of the game to add to the user's favorites.
	 */
	public void addFavorite(int ID) {
		apiRequest("User_Favorites.php?accountid=" + userId + "&type=add&gameid=" + ID, null);
	}
	
	/**
	 * Removes the game with the specified ID from the user's favorites.
	 * @param ID The ID of the game to remove from the favorites.
	 */
	public void removeFavorite(int ID) {
		apiRequest("User_Favorites.php?accountid=" + userId + "&type=remove&gameid=" + ID, null);
	}
	
	/**
	 * Returns a UserFavorites item containing a list of the user's favorites.
	 * @return A UserFavorites item containing a list of the user's favorites.
	 */
	public UserFavorites getFavorites() {
		return apiRequest("User_Favorites.php?accountid=" + userId, new UserFavorites());
	}
	
	/**
	 * Returns a Data<GameImage> item containing information about the images for the game with the specified ID.
	 * @param ID The ID of the game to retrieve art for.
	 * @return A Data<GameImage> item containing information about the images for the game with the specified ID.
	 */
	public Data<GameImage> getArt(int ID) {
		return apiRequest("GetArt.php?id=" + ID, new Data<GameImage>());
	}
	
	/**
	 * Returns a list of game IDs that have been updated in the last seconds specified by time.
	 * @param time How many seconds back to look for updated games.
	 * @return List of games that have been updated in last time seconds.
	 */
	public Updates getUpdates(int time) {
		return apiRequest("Updates.php?time=" + time, new Updates());
	}
}