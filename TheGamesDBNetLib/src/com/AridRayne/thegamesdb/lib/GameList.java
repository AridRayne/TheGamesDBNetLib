package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;

/**
 *
 * @author Pieter van Dorst
 */
public class GameList implements Serializable {
	private static final long serialVersionUID = 1414253223493142749L;
	@ElementList(entry="Game", inline=true)
	private List<GameListItem> items;

	/**
	 * Returns a list of GameListItems that contains all the game names, release dates, and platforms.
	 * @return List of PlatformListItem.
	 */
	public List<GameListItem> getItems() {
		return this.items;
	}

	/**
	 * Sets the list of GameListItem.
	 * @param items The list of PlatformListItem.
	 */
	public void setItems(List<GameListItem> items) {
		this.items = items;
	}
	
	/**
	 * Returns the GameListItem at the specified position.
	 * @param position The position of the GameItem to get.
	 * @return The GameListItem at the specified position.
	 */
	public GameListItem getItem(int position) {
		return this.items.get(position);
	}

	public GameList() {
		this.items = new ArrayList<GameListItem>();
	}
}
