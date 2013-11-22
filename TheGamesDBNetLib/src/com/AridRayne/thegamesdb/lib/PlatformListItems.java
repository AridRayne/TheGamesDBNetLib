package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class PlatformListItems implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2523150382777395131L;
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
