package net.thegamesdb.lib;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class GameItem {
	public int id;
	@XmlElement(name="GameTitle")
	public String title;
	@XmlElement(name="PlatformId")
	public int platformID;
	@XmlElement(name="Platform")
	public String platform;
	@XmlElement(name="ReleaseDate")
	public Date releaseDate;
	@XmlElement(name="Overview")
	public 	String overview;
	@XmlElement(name="ESRB")
	public String esrb;
	@XmlElement(name="Genres")
	public List<String> genres;
	@XmlElement(name="Players")
	public String players;
	@XmlElement(name="Co-op")
	public String coop;
	@XmlElement(name="Youtube")
	public String youtube;
	@XmlElement(name="Publisher")
	public String publisher;
	@XmlElement(name="Developer")
	public String developer;
	@XmlElement(name="Rating")
	public double rating;
	
	public GameItem() {
		this.id = 0;
		this.title = "";
		this.platformID = 0;
		this.platform = "";
		this.releaseDate = new Date();
		this.overview = "";
		this.esrb = "";
		this.players = "";
		this.coop = "";
		this.youtube = "";
		this.publisher = "";
		this.developer = "";
		this.rating = 0.0;
	}
}
