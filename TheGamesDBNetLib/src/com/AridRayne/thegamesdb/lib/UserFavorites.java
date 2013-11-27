package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;

public class UserFavorites implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3770433221340382400L;
	@ElementList(inline=true, entry="Game")
	private List<Integer> games;
	
	public UserFavorites() {
		this.games = new ArrayList<Integer>();
	}

	public List<Integer> getGames() {
		return games;
	}

	public void setGames(List<Integer> games) {
		this.games = games;
	}
	
	public int getItem(int Position) {
		return this.games.get(Position);
	}
}
