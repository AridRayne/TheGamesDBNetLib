package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

/**
 *
 * @author Pieter van Dorst
 */
public class GameList implements Serializable {
    	/**
	 * 
	 */
	@ElementList(entry="Game", inline=true)
	private List<GameListItem> items;

	/**
	 * Returns a list of GameListItems that contains all the game names, release dates, and platforms.
	 * @return List of PlatformListItem.
	 */
	public List<GameListItem> getItems() {
		return items;
	}

	/**
	 * Sets the list of GameListItem.
	 * @param items The list of PlatformListItem.
	 */
	public void setItems(List<GameListItem> items) {
		this.items = items;
	}
	
	public GameListItem getItem(int Position) {
		return this.items.get(Position);
	}

	public GameList() {
		items = new ArrayList<GameListItem>();
	}
}
