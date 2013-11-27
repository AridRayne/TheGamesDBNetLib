package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;

/**
 * A class containing information about a language.
 * @author AridRayne
 *
 */
public class LanguageItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2970635142003774845L;
	@Element
	private String name;
	@Element
	private String abbreviation;
	@Element
	private int id;
	/**
	 * Returns the name of the language.
	 * @return The name of the language.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name of the language.
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Returns the abbreviation of the language.
	 * @return The abbreviation of the language.
	 */
	public String getAbbreviation() {
		return abbreviation;
	}
	/**
	 * Sets the abbreviation of the language.
	 * @param abbreviation The abbreviation to set.
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	/**
	 * Returns the ID of the language.
	 * @return The ID of the language.
	 */
	public int getId() {
		return id;
	}
	/**
	 * Sets the ID of the language.
	 * @param id The ID to set.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public LanguageItem() {
		this.name = "";
		this.abbreviation = "";
		this.id = 0;
	}
}
