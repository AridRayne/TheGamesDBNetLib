package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

import com.AridRayne.thegamesdb.lib.image.GameImage;

public class Game implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3404387198259596339L;
	@Element
	private int id;
	@Element(name="GameTitle")
	private String title;
	@Element(name="PlatformId")
	private int platformID;
	@Element(name="Platform")
	private String platform;
	@Element(name="Overview", required=false)
	private 	String overview;
	@Element(name="ESRB", required=false)
	private String esrb;
	@Path("Genres")
	@ElementList(inline=true, entry="genre", required=false)
	private List<String> genres;
	@Element(name="Players", required=false)
	private String players;
	@Element(name="Co-op", required=false)
	private String coop;
	@Element(name="Youtube", required=false)
	private String youtube;
	@Element(name="Publisher", required=false)
	private String publisher;
	@Element(name="Developer", required=false)
	private String developer;
	@Element(name="Rating", required=false)
	private double rating;
	@Element(name="ReleaseDate", required=false)
	private Date releaseDate;
	@Element(name="Images", required=false)
	private GameImage images;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPlatformID() {
		return platformID;
	}

	public void setPlatformID(int platformID) {
		this.platformID = platformID;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getEsrb() {
		return esrb;
	}

	public void setEsrb(String esrb) {
		this.esrb = esrb;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public String getPlayers() {
		return players;
	}

	public void setPlayers(String players) {
		this.players = players;
	}

	public String getCoop() {
		return coop;
	}

	public void setCoop(String coop) {
		this.coop = coop;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public GameImage getImages() {
		return images;
	}

	public void setImages(GameImage images) {
		this.images = images;
	}

	public Game() {
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
