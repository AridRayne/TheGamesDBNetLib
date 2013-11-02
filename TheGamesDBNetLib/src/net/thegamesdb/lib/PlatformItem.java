package net.thegamesdb.lib;

import javax.xml.bind.annotation.XmlElement;

//TODO: Add fields for images from the xml.
public class PlatformItem {
	public int id;
	@XmlElement(name="Platform")
	public String name;
	public String overview;
	public String developer;
	public String manufacturer;
	public String cpu;
	public String memory;
	public String graphics;
	public String sound;
	public String display;
	public String media;
	@XmlElement(name="maxcontrollers")
	public int maxControllers;
	@XmlElement(name="Rating")
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