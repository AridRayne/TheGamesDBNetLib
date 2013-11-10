package com.AridRayne.thegamesdb.lib;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

//@Path("Platforms")
@Root
public class PlatformList {
	@Element
	public String basePlatformUrl;
	@Path("Platforms")
	@ElementList(entry="Platform", inline=true)
	public List<PlatformListItems> items;
}
