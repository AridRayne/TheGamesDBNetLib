package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.AridRayne.thegamesdb.lib.image.PlatformImage;

//TODO: Add fields for images from the xml.
@Element(name="Platform")
public class PlatformItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8028629731109058336L;
	@Element
	public int id;
	@Element(name="Platform")
	public String name;
	@Element(required=false)
	public String console;
	@Element(required=false)
	public String controller;
	@Element(required=false)
	public String overview;
	@Element(required=false)
	public String developer;
	@Element(required=false)
	public String manufacturer;
	@Element(required=false)
	public String cpu;
	@Element(required=false)
	public String memory;
	@Element(required=false)
	public String graphics;
	@Element(required=false)
	public String sound;
	@Element(required=false)
	public String display;
	@Element(required=false)
	public String media;
	@Element(name="maxcontrollers", required=false)
	public String maxControllers;
	@Element(name="Rating", required=false)
	public double rating;
	@Element(name="Images", required=false)
	public PlatformImage images;
	
	public PlatformItem() {
		this.id = 0;
		this.name = "";
		this.overview = "";
		this.developer = "";
		this.manufacturer = "";
		this.cpu = "";
		this.memory = "";
		this.graphics = "";
		this.sound = "";
		this.display = "";
		this.media = "";
		this.maxControllers = "";
		this.rating = 0.0;
		//this.images = new PlatformImages();
	}
}