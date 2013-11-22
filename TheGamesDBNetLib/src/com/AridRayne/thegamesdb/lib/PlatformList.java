package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

//@Path("Platforms")
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
	private List<PlatformListItems> items;
	
	public String getBasePlatformUrl() {
		return basePlatformUrl;
	}

	public void setBasePlatformUrl(String basePlatformUrl) {
		this.basePlatformUrl = basePlatformUrl;
	}

	public List<PlatformListItems> getItems() {
		return items;
	}

	public void setItems(List<PlatformListItems> items) {
		this.items = items;
	}

	public PlatformList() {
		basePlatformUrl = "";
		items = new ArrayList<PlatformListItems>();
	}
}
