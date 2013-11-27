package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;

/**
 * A class that contains information about all the platforms in thegamesdb.net database.
 * @author AridRayne
 *
 */
public class PlatformListItem implements Serializable {
	private static final long serialVersionUID = -2523150382777395131L;
	@Element
	private int id;
	@Element
	private String name;
	@Element(required=false)
	private String alias;

	/**
	 * Returns the ID of the platform.
	 * @return The ID of the platform.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the ID of the platform.
	 * @param id The ID of the platform.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the name of the platform.
	 * @return The name of the platform.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name of the platform.
	 * @param name The name of the platform.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the alias of the platform.
	 * @return The alias of the platform.
	 */
	public String getAlias() {
		return this.alias;
	}

	/**
	 * Sets the alias of the platform.
	 * @param alias The alias of the platform.
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public String toString() {
		return name;
	}
}
