package com.AridRayne.thegamesdb.lib;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.transform.RegistryMatcher;

public class Utilities {
	private String devId;
	private String userId;
	private String apiUrl = "http://thegamesdb.net/api/";
	private String userAgent = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2";
	private static Utilities instance;
	
	public static Utilities getInstance() {
		if (instance == null)
			instance = new Utilities();
		return instance;
	}
	
	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	private Utilities() {
		this.devId = "";
		this.userId = "";
	}
	
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
	@SuppressWarnings("unchecked")
	public Data<Game> getGameFromID(int ID) {
		Data<Game> game = new Data<Game>();
		try {
			URL url;
			url = new URL(apiUrl + "GetGame.php?id=" + ID);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", userAgent);
			InputStream is = conn.getInputStream();
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			RegistryMatcher m = new RegistryMatcher();
			m.bind(Date.class, new DateTransformer(df));
			Serializer serializer = new Persister(m);
			game = serializer.read(Data.class, is, false);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return game;
	}
	
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
}