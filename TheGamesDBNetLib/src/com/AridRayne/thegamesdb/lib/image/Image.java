package com.AridRayne.thegamesdb.lib.image;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

/**
 * A class that contains information about images retrieved from thegamesdb.net
 * @author AridRayne
 *
 */
public class Image {
	@Attribute(required=false)
	private int width;
	@Attribute(required=false)
	private int height;
	@Text
	private String url;
	
	/**
	 * Returns the width of the image.
	 * @return The width of the image.
	 */
	public int getWidth() {
		return this.width;
	}
	
	/**
	 * Sets the width of the image.
	 * @param width The width of the image.
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Returns the height of the image.
	 * @return The height of the image.
	 */
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * Sets the height of the image.
	 * @param height The height of the image.
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Returns the url of the image.
	 * @return The url of the image.
	 */
	public String getUrl() {
		return this.url;
	}
	
	/**
	 * Sets the url of the image.
	 * @param url The url of the image.
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
