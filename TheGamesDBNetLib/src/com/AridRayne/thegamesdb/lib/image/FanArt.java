package com.AridRayne.thegamesdb.lib.image;

import org.simpleframework.xml.Element;

/**
 * A class containing information about the fanart of a Game or Platform.
 * @author AridRayne
 *
 */
public class FanArt {
	@Element(name="original")
	private Image original;
	@Element(name="thumb")
	private String thumb;
	
	/**
	 * Returns the url of the full-size original fanart image.
	 * @return The url of the fanart image.
	 */
	public Image getOriginal() {
		return this.original;
	}
	
	/**
	 * Sets the url of the full-size original fanart image.
	 * @param original The url of the fanart image.
	 */
	public void setOriginal(Image original) {
		this.original = original;
	}
	
	/**
	 * Returns the url of the thumbnail of the fanart image.
	 * @return The url of the thumbnail.
	 */
	public String getThumb() {
		return this.thumb;
	}
	
	/**
	 * Sets the url of the thumbnail of the fanart image.
	 * @param thumb The url of the thumbnail.
	 */
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
}
