package net.thegamesdb.lib;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Utilities {
	public static PlatformData PlatformFromID(int ID) {
		PlatformData platform = new PlatformData();
		URL url;
		try {
			url = new URL("http://thegamesdb.net/api/GetPlatform.php?id=" + ID);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
			InputStream is = conn.getInputStream();
			JAXBContext context = JAXBContext.newInstance(PlatformData.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			platform = (PlatformData) unmarshaller.unmarshal(is);
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}

		return platform;
	}
	
	//TODO: Add the other options for finding games from http://wiki.thegamesdb.net/index.php?title=GetGame
	public static GameData GameFromID(int ID) {
		GameData game = new GameData();
		try {
			URL url;
			url = new URL("http://thegamesdb.net/api/GetGame.php?id=" + ID);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
			InputStream is = conn.getInputStream();
			JAXBContext context = JAXBContext.newInstance(GameData.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			game = (GameData) unmarshaller.unmarshal(is);
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return game;
	}
}
