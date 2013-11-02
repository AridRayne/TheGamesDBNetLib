package net.thegamesdb.lib;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Data")
public class GameData {
	@XmlElement(name="baseImgUrl")
	public String baseImgUrl;
	@XmlElement(name="Game")
	public List<GameItem> games;
	
/*	public GameData() {
		this.baseImgUrl = "";
		this.games = new ArrayList<GameItem>();
	}*/
}
