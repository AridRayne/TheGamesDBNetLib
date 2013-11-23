  package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementUnion;

/**
 * A class that contains information retrieved from thegamesdb.net
 * @author AridRayne
 *
 * @param <T> The type that will be used for the items. Usually Platform or Game.
 */
public class Data<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5504421083287971252L;
	@ElementUnion({
		@Element(name="baseImgUrl"),
		@Element(name="basePlatformUrl")
	})
	private String baseUrl;
	@ElementListUnion({
		@ElementList(entry="Game", type=Game.class, inline=true),
		@ElementList(entry="Platform", type=Platform.class, inline=true),
	})
	private List<T> items;
	
	/**
	 * Returns the base url for the data item, usually teh base url for images. This can be null.
	 * @return The base url for the data item.
	 */
	public String getBaseUrl() {
		return baseUrl;
	}
	
	/**
	 * Returns the items list for the data item.
	 * @return The items for the data item.
	 */
	public List<T> getItems() {
		return items;
	}
	
	/**
	 * Sets the items list for the data item.
	 * @param items The items list to set.
	 */
	public void setItems(List<T> items) {
		this.items = items;
	}
	
	/**
	 * Returns an item at the specified position.
	 * @param Position The position of the item to return.
	 * @return The item at the specified position.
	 */
	public T getItem(int Position) {
		return this.items.get(Position);
	}
}
