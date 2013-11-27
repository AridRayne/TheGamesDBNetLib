package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;

public class UserFavorites implements Serializable {
	private static final long serialVersionUID = -3770433221340382400L;
	@ElementList(inline=true, entry="Game")
	private List<Integer> games;
	
	public UserFavorites() {
		this.games = new ArrayList<Integer>();
	}

	/**
	 * Returns a list of the game IDs of the user's favorites.
	 * @return A list of the game IDs of the user's favorites.
	 */
	public List<Integer> getGames() {
		return this.games;
	}

	/**
	 * Sets the list of integers that contains the game IDs of the user's favorites.
	 * @param games The list of integers to set.
	 */
	public void setGames(List<Integer> games) {
		this.games = games;
	}
	
	/**
	 * Returns the game ID at the specified position.
	 * @param position The position of the game ID to get.
	 * @return The game ID at the specified position.
	 */
	public int getItem(int position) {
		return this.games.get(position);
	}
}
