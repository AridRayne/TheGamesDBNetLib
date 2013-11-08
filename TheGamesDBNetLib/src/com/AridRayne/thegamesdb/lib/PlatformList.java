package com.AridRayne.thegamesdb.lib;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

@Path("Platform")
public class PlatformList {
	@Element
	public String basePlatformUrl;
	@ElementList(entry="Platform", inline=true)
	@Path("Platforms")
	public List<PlatformListItems> items;
}
