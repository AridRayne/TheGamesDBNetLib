package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class PlatformListItems implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2523150382777395131L;
	@Element
	private int id;
	@Element
	private String name;
	@Element(required=false)
	private String alias;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public String toString() {
		return name;
	}
}
