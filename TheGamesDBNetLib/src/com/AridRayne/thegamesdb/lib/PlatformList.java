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
	public String basePlatformUrl;
	@Path("Platforms")
	@ElementList(entry="Platform", inline=true)
	public List<PlatformListItems> items;
	
	public PlatformList() {
		basePlatformUrl = "";
		items = new ArrayList<PlatformListItems>();
	}
}
