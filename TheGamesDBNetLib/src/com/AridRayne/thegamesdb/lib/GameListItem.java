package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;

/**
 *
 * @author Pieter van Dorst
 */
public class GameListItem implements Serializable {
	private static final long serialVersionUID = 1400627509081199617L;
    @Element
    private int id;
	@Element(name="GameTitle")
	private String title;
	@Element(name="ReleaseDate", required=false)
	private String releaseDate;
	@Element(name="Platform", required=false)
	private String platform;

	/**
	 * Returns the ID of the game.
	 * @return The ID of the game.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the ID of the game.
	 * @param id The ID of the game.
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
	 * @param title The title of the game.
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
	 * @param platform The release date of the game.
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
        
    /**
     * get the platform the game runs on.
     * @return the platform the game runs on.
     */
    public String getPlatform() {
        return this.platform;
    }
    
    /**
     * Set the platform the game runs on.
     * @param platform the platform the game runs on.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

	@Override
	public String toString() {
		return this.title;
	}
	
	public GameListItem() {
		this.id = 0;
		this.title = "";
		this.releaseDate = "";
		this.platform = "";
	}
}
