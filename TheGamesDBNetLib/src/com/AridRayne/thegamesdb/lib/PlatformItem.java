package com.AridRayne.thegamesdb.lib;

import org.simpleframework.xml.Element;

//TODO: Add fields for images from the xml.
@Element(name="Platform")
public class PlatformItem {
	@Element
	public int id;
	@Element(name="Platform")
	public String name;
	@Element
	public String console;
	@Element
	public String controller;
	@Element
	public String overview;
	@Element
	public String developer;
	@Element
	public String manufacturer;
	@Element
	public String cpu;
	@Element
	public String memory;
	@Element
	public String graphics;
	@Element
	public String sound;
	@Element
	public String display;
	@Element
	public String media;
	@Element(name="maxcontrollers")
	public int maxControllers;
	@Element(name="Rating")
	public double rating;
	//public PlatformImages images;
	
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
		this.maxControllers = 0;
		this.rating = 0.0;
		//this.images = new PlatformImages();
	}
}