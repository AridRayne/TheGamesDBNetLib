package com.AridRayne.thegamesdb.lib;

import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

public class GameItem {
	@Element
	public int id;
	@Element(name="GameTitle")
	public String title;
	@Element(name="PlatformId")
	public int platformID;
	@Element(name="Platform")
	public String platform;
	@Element(name="Overview")
	public 	String overview;
	@Element(name="ESRB")
	public String esrb;
	@Path("Genres")
	@ElementList(inline=true, entry="genre")
	public List<String> genres;
	@Element(name="Players")
	public String players;
	@Element(name="Co-op", required=false)
	public String coop;
	@Element(name="Youtube", required=false)
	public String youtube;
	@Element(name="Publisher")
	public String publisher;
	@Element(name="Developer")
	public String developer;
	@Element(name="Rating")
	public double rating;
	@Element(name="ReleaseDate")
	public Date releaseDate;
	
	public GameItem() {
		this.id = 0;
		this.title = "";
		this.platformID = 0;
		this.platform = "";
//		this.releaseDate = new Date();
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
