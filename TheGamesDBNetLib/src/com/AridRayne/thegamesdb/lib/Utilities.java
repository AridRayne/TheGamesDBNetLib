package com.AridRayne.thegamesdb.lib;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

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
	
	/**
	 * Returns a Data<Platform> item that contains information about the platform with the specified ID.
	 * @param ID The ID of the platform to retrieve.
	 * @return A Data<Platform> item containing information about the platform with the specified ID.
	 */
	@SuppressWarnings("unchecked")
	public Data<Platform> getPlatformFromID(int ID) {
		Data<Platform> platform = new Data<Platform>();
		URL url;
		try {
			url = new URL(apiUrl + "GetPlatform.php?id=" + ID);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", userAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			platform = serializer.read(Data.class, is, false);
		} catch (IOException  e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return platform;
	}
	
	//TODO: Add the other options for finding games from http://wiki.thegamesdb.net/index.php?title=GetGame
	/**
	 * Returns a Data<Game> item that contains information about the game with the specified ID.
	 * @param ID The ID of the game to retrieve.
	 * @return A Data<Game> item containing information about the game with the specified ID.
	 */
	@SuppressWarnings("unchecked")
	public Data<Game> getGameFromID(int ID) {
		Data<Game> game = new Data<Game>();
		try {
			URL url;
			url = new URL(apiUrl + "GetGame.php?id=" + ID);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", userAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			game = serializer.read(Data.class, is, false);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return game;
	}
	
	/**
	 * Sets the user's rating of the game with the specified ID. The user is specified by setting the User ID of the Utilities singleton.
	 * @param ID The ID of the game to set the rating for.
	 * @param Rating The rating to set.
	 * @see setUserID
	 */
	public void setRating(int ID, double Rating) {
			try {
				URL url;
				url = new URL(apiUrl + "User_Rating.php?accountid=" + userId + "&itemid=" + ID + "&rating=" + Rating);
				URLConnection conn = url.openConnection();
				conn.setRequestProperty("User-Agent", userAgent);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * Returns the user's rating of the game with the specified ID. The user is specified by setting the User ID of the Utilities singleton. Right now, the API seems to only return the community average rating.
	 * @param ID The ID of the game to get the rating for.
	 * @return The user's rating of the game with the specified ID.
	 * @see setUserId
	 */
	public double getRating(int ID) {
		try {
			URL url;
			url = new URL(apiUrl + "User_Rating.php?accountid=" + userId + "&itemid=" + ID);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", userAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			ratingClass rc = serializer.read(ratingClass.class, is, false);
			return rc.getRating();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	/**
	 * Returns a list of all platforms in thegamesdb.net database.
	 * @return PlatformList containing a list of all platforms.
	 */
	public PlatformList getPlatformList() {
		try {
			URL url;
			url = new URL(apiUrl + "GetPlatformsList.php");
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", userAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			PlatformList list = serializer.read(PlatformList.class, is, false);
			return list;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
        
        	/**
	 * Returns a list of all platforms in thegamesdb.net database.
	 * @return PlatformList containing a list of all platforms.
	 */
	public GameList getGamesList(String name) {
		try {
			URL url;
			url = new URL(apiUrl + "GetGamesList.php?name=" + name);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", userAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			GameList list = serializer.read(GameList.class, is, false);
			return list;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}