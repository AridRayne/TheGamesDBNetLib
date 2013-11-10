package com.AridRayne.thegamesdb.lib;

import org.simpleframework.xml.Element;

public class PlatformListItems {
	@Element
	public int id;
	@Element
	public String name;
	@Element(required=false)
	public String alias;

	@Override
	public String toString() {
		return name;
	}
}
