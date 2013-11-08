package com.AridRayne.thegamesdb.lib;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;

public class PlatformListItems {
	@Element
	@Path("Platform")
	public int id;
	@Element
	@Path("Platform")
	public String name;
	@Element
	@Path("Platform")
	public String alias;
}
