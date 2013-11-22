package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

/**
 * A class that contains a list of platforms retrieved from thegamesdb.net
 * @author AridRayne
 *
 */
@Root
public class PlatformList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1229486620611225660L;
	@Element
	private String basePlatformUrl;
	@Path("Platforms")
	@ElementList(entry="Platform", inline=true)
	private List<PlatformListItem> items;
	
	/**
	 * Returns the base platform url.
	 * @return The base platform url.
	 */
	public String getBasePlatformUrl() {
		return basePlatformUrl;
	}

	/**
	 * Sets the base platform url.
	 * @param basePlatformUrl The base platform url.
	 */
	public void setBasePlatformUrl(String basePlatformUrl) {
		this.basePlatformUrl = basePlatformUrl;
	}

	/**
	 * Returns a list of PlatformListItem that contains all the platforms names, aliases, and IDs.
	 * @return List of PlatformListItem.
	 */
	public List<PlatformListItem> getItems() {
		return items;
	}

	/**
	 * Sets the list of PlatformListItem.
	 * @param items The list of PlatformListItem.
	 */
	public void setItems(List<PlatformListItem> items) {
		this.items = items;
	}
	
	public PlatformListItem getItem(int Position) {
		return this.items.get(Position);
	}

	public PlatformList() {
		basePlatformUrl = "";
		items = new ArrayList<PlatformListItem>();
	}
}
