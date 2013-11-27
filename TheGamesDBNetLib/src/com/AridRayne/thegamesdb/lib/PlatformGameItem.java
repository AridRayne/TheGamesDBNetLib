package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;

/**
 * A class containing information about the games for a platform.
 * @author AridRayne
 *
 */
public class PlatformGameItem implements Serializable {
	private static final long serialVersionUID = -4161069046017158796L;
	@Element
	private int id;
	@Element(name="GameTitle")
	private String title;
	@Element(name="ReleaseDate", required=false)
	private String releaseDate;
	@Element(name="thumb", required=false)
	private String thumb;

	/**
	 * Returns the ID of the game.
	 * @return The ID of the game.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the ID of the game.
	 * @param id The ID to set.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the title of the game.
	 * @return The title of the game.
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Sets the title of the game.
	 * @param title The title to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Returns the release date of the game.
	 * @return The release date of the game.
	 */
	public String getReleaseDate() {
		return this.releaseDate;
	}

	/**
	 * Sets the release date of the game.
	 * @param releaseDate The release date to set.
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	/**
	 * Returns the url of the thumbnail image for the game, if you're using this to download the image, it should be prefixed with the baseImgUrl from getGame().
	 * @return The url of the thumbnail image for the game.
	 * @see getGame();
	 */
	public String getThumb() {
		return this.thumb;
	}

	/**
	 * Sets the url of the thumbnail image for the game.
	 * @param thumb The url of the thumbnail image to set.
	 */
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public PlatformGameItem() {
		this.id = 0;
		this.title = "";
		this.releaseDate = "";
		this.thumb = "";
	}
}