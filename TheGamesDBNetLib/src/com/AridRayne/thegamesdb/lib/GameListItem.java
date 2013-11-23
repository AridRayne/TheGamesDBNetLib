package com.AridRayne.thegamesdb.lib;

import org.simpleframework.xml.Element;

/**
 *
 * @author Pieter
 */
public class GameListItem {
    	/**
	 * 
	 */
        @Element
        private int id;
	@Element(name="GameTitle")
	private String name;
	@Element(name="ReleaseDate", required=false)
	private String releaseDate;
	@Element(name="Platform", required=false)
	private String platform;

	/**
	 * Returns the ID of the game.
	 * @return The ID of the game.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the ID of the game.
	 * @param id The ID of the game.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the name of the game.
	 * @return The name of the game.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the game.
	 * @param name The name of the game.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the release date of the game.
	 * @return The release date of the game.
	 */
	public String getReleaseDate() {
		return releaseDate;
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
            return platform;
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
		return name;
	}
}
