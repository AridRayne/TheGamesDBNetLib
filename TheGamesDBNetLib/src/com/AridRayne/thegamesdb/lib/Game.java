package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

import com.AridRayne.thegamesdb.lib.image.GameImage;

/**
 * A class that contains information about a game retrieved from thegamesdb.net
 * @author AridRayne
 *
 */
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
	
	/**
	 * Returns the game's ID.
	 * @return The game's ID.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the game's ID.
	 * @param id The ID of the game.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the game's title.
	 * @return The game's title.
	 */
	public String getTitle() {
		return StringEscapeUtils.unescapeXml(title);
	}

	/**
	 * Sets the game's title.
	 * @param title The title of the game.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Returns the game's platform ID.
	 * @return The game's platform ID.
	 */
	public int getPlatformID() {
		return platformID;
	}

	/**
	 * Set's the game's platform ID.
	 * @param platformID The platform ID.
	 */
	public void setPlatformID(int platformID) {
		this.platformID = platformID;
	}

	/**
	 * Returns the name of the platform that the game belongs to.
	 * @return The name of the platform that the game belongs to.
	 */
	public String getPlatform() {
		return StringEscapeUtils.unescapeXml(platform);
	}

	/**
	 * Sets the name of the platform that the game belongs to.
	 * @param platform The name of the platform.
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * Returns the overview of the game.
	 * @return The overview of the game.
	 */
	public String getOverview() {
		return StringEscapeUtils.unescapeXml(overview);
	}

	/**
	 * Sets the overview of the game.
	 * @param overview The overview of the game.
	 */
	public void setOverview(String overview) {
		this.overview = overview;
	}

	/**
	 * Returns the ESRB rating of the game.
	 * @return the ESRB rating of the game.
	 */
	public String getEsrb() {
		return StringEscapeUtils.unescapeXml(esrb);
	}

	/**
	 * Sets the ESRB rating of the game.
	 * @param esrb The ESRB rating of the game.
	 */
	public void setEsrb(String esrb) {
		this.esrb = esrb;
	}

	/**
	 * Returns a list of the genres for the game.
	 * @return A list of the genres for the game.
	 */
	public List<String> getGenres() {
		return genres;
	}

	/**
	 * Sets the list of genres for the game.
	 * @param genres The list of genres for the game.
	 */
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	/**
	 * Returns the number of players for the game. This is a string because players can be written like "1-4".
	 * @return The number of players for the game.
	 */
	public String getPlayers() {
		return StringEscapeUtils.unescapeXml(players);
	}

	/**
	 * Sets the number of players for the game. This is a string because players can be written like "1-4".
	 * @param players The number of players for the game.
	 */
	public void setPlayers(String players) {
		this.players = players;
	}

	/**
	 * Returns the Co-Op capabilities of the game. This is a string because the value can be things like "yes", "no", "local", "online", et cetera.
	 * @return The Co-Op capabilities of the game.
	 */
	public String getCoop() {
		return StringEscapeUtils.unescapeXml(coop);
	}

	/**
	 * Sets the Co-Op capabilities of the game. This is a string because the value can be things like "yes", "no", "local", "online", et cetera.
	 * @param coop The Co-Op capabilities of the game.
	 */
	public void setCoop(String coop) {
		this.coop = coop;
	}

	/**
	 * Returns the youtube link for the game.
	 * @return The youtube link for the game.
	 */
	public String getYoutube() {
		return youtube;
	}

	/**
	 * Sets the youtube link for the game.
	 * @param youtube The youtube link for the game.
	 */
	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	/**
	 * Returns the publisher for the game.
	 * @return The publisher for the game.
	 */
	public String getPublisher() {
		return StringEscapeUtils.unescapeXml(publisher);
	}

	/**
	 * Sets the publisher for the game
	 * @param publisher The publisher for the game.
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * Returns the developer for the game.
	 * @return The developer for the game.
	 */
	public String getDeveloper() {
		return StringEscapeUtils.unescapeXml(developer);
	}

	/**
	 * Sets the developer for the game.
	 * @param developer The developer for the game.
	 */
	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	/**
	 * Returns the rating for the game.
	 * @return The rating for the game.
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * Sets the rating for the game.
	 * @param rating The rating for the game.
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

	/**
	 * Returns the release date for the game.
	 * @return The release date for the game.
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * Sets the release date for the game.
	 * @param releaseDate The release date for the game.
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * Returns a GameImage item with the images for the game.
	 * @return The images for the game.
	 */
	public GameImage getImages() {
		return images;
	}

	/**
	 * Sets the GameImage images item for the game.
	 * @param images GameImage images item for the game.
	 */
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
