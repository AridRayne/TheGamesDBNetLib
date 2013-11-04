package net.thegamesdb.lib;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Utilities {
	private String _mDevId;
	private String _mApiUrl = "http://thegamesdb.net/api/";
	private String _mUserAgent = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2";
	
	public Utilities() {
		this._mDevId = "";
	}
	
	public Utilities(String DeveloperID) {
		this._mDevId = DeveloperID;
	}
	
	@SuppressWarnings("unchecked")
	public Data<PlatformItem> PlatformFromID(int ID) {
		//GenericData<PlatformItem> platform = new GenericData<PlatformItem>();
		Data<PlatformItem> platform = new Data<PlatformItem>();
		URL url;
		try {
			url = new URL(_mApiUrl + "GetPlatform.php?id=" + ID);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", _mUserAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			platform = serializer.read(Data.class, is, false);
			//platform = serializer.read(PlatformData.class, is, false);
		} catch (IOException  e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return platform;
	}
	
	//TODO: Add the other options for finding games from http://wiki.thegamesdb.net/index.php?title=GetGame
	@SuppressWarnings("unchecked")
	public Data<GameItem> GameFromID(int ID) {
		Data<GameItem> game = new Data<GameItem>();
		try {
			URL url;
			url = new URL(_mApiUrl + "GetGame.php?id=" + ID);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", _mUserAgent);
			InputStream is = conn.getInputStream();
			Serializer serializer = new Persister();
			game = serializer.read(Data.class, is, false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return game;
	}
}
