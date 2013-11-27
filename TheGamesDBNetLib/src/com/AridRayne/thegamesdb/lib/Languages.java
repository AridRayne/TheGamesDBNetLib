package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.ElementList;

/**
 * A class containing information about languages.
 * @author AridRayne
 *
 */
public class Languages implements Serializable{
	private static final long serialVersionUID = -2867727676814797214L;
	@ElementList(entry="Language", inline=true)
	private List<LanguageItem> languages;

	/**
	 * Returns a list of LanguageItem with information about languages.
	 * @return A list of LanguageItem with information about languages.
	 */
	public List<LanguageItem> getLanguages() {
		return this.languages;
	}

	/**
	 * Sets the list of LanguageItem with information about languages.
	 * @param languages The list of LanguageItem to set.
	 */
	public void setLanguages(List<LanguageItem> languages) {
		this.languages = languages;
	}
	
	/**
	 * Returns the LanguageItem at the specified position.
	 * @param position The position of the LanguageItem to get.
	 * @return The LanguageItem at the specified position.
	 */
	public LanguageItem getItem(int position) {
		return this.languages.get(position);
	}
}
