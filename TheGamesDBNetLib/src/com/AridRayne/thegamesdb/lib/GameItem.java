package com.AridRayne.thegamesdb.lib;

import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

import com.AridRayne.thegamesdb.lib.image.GameImage;

public class GameItem {
	@Element
	public int id;
	@Element(name="GameTitle")
	public String title;
	@Element(name="PlatformId")
	public int platformID;
	@Element(name="Platform")
	public String platform;
	@Element(name="Overview", required=false)
	public 	String overview;
	@Element(name="ESRB", required=false)
	public String esrb;
	@Path("Genres")
	@ElementList(inline=true, entry="genre", required=false)
	public List<String> genres;
	@Element(name="Players", required=false)
	public String players;
	@Element(name="Co-op", required=false)
	public String coop;
	@Element(name="Youtube", required=false)
	public String youtube;
	@Element(name="Publisher", required=false)
	public String publisher;
	@Element(name="Developer", required=false)
	public String developer;
	@Element(name="Rating")
	public double rating;
	@Element(name="ReleaseDate", required=false)
	public Date releaseDate;
	@Element(name="Images", required=false)
	public GameImage images;
	
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
