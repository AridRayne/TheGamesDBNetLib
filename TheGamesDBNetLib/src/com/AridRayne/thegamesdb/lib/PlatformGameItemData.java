package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;

/**
 * A class with a list of PlatformGameItems.
 * @see PlatformGameItem.
 * @author AridRayne
 *
 */
public class PlatformGameItemData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5513626853640738642L;
	@ElementList(entry="Game", inline=true)
	private List<PlatformGameItem> items;
	
	/**
	 * Returns a list of PlatformGameItems with information about the games for the platform.
	 * @return A list of PlatformGameItems with information about the games for the platform.
	 */
	public List<PlatformGameItem> getItems() {
		return items;
	}

	/**
	 * Sets the list of PlatformGameItems with information about the games for the platform.
	 * @param items The list of PlatformGameItems to set.
	 */
	public void setItems(List<PlatformGameItem> items) {
		this.items = items;
	}
	
	public PlatformGameItemData() {
		this.items = new ArrayList<PlatformGameItem>();
	}
	
	/**
	 * Returns the PlatformGameItem with the specified position.
	 * @param Position The position of the PlatformGameItem to get.
	 * @return The PlatformGameItem with the specified position.
	 */
	public PlatformGameItem getItem(int Position) {
		return this.items.get(Position);
	}
}
