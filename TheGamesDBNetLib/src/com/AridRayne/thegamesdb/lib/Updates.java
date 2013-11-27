package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

/**
 * A class containing a list of game IDs for games that have been updated recently.
 * @author AridRayne
 *
 */
public class Updates implements Serializable {
	private static final long serialVersionUID = 2648027798677819292L;
	@Element(name="Time")
	private int time;	
	@ElementList(entry="Game", inline=true)
	private List<Integer> items;
	
	/**
	 * Returns the time of the request from the server. This is GMT.
	 * @return The time of the request from the server. This is GMT.
	 */
	public int getTime() {
		return this.time;
	}

	/**
	 * Sets the time of the request from the server. This is GMT.
	 * @param time The time of the request from the server. This is GMT.
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * Returns a list of game IDs for games that have been updated.
	 * @return A list of game IDs for games that have been update.
	 */
	public List<Integer> getItems() {
		return this.items;
	}

	/**
	 * Sets the list of game IDs for games that have been updated.
	 * @param items The list of game IDs for games that have been updated.
	 */
	public void setItems(List<Integer> items) {
		this.items = items;
	}

	/**
	 * Returns the game ID at the specified position.
	 * @param position The position of the game ID to retrieve.
	 * @return The game ID at the specified position.
	 */
	public int getItem(int position) {
		return this.items.get(position);
	}

	public Updates() {
		this.time = 0;
		this.items = new ArrayList<Integer>();
	}
}