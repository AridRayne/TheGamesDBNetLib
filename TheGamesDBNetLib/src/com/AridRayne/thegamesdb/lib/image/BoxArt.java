package com.AridRayne.thegamesdb.lib.image;

import org.simpleframework.xml.Attribute;

/**
 * A class containing information about the boxart of a Game or Platform.
 * @author AridRayne
 *
 */
public class BoxArt extends Image {
	@Attribute
	private String side;

	/**
	 * Returns a string defining which side of the box this image is of.
	 * @return Which side of the box the image is of.
	 */
	public String getSide() {
		return side;
	}

	/**
	 * Sets a string defining which side of the box this image is of.
	 * @param side Which side of the box the image is of.
	 */
	public void setSide(String side) {
		this.side = side;
	}
}
