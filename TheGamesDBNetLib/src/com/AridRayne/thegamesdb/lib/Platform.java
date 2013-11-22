package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.AridRayne.thegamesdb.lib.image.PlatformImage;

//TODO: Add fields for images from the xml.
@Element(name="Platform")
public class Platform implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8028629731109058336L;
	@Element
	private int id;
	@Element(name="Platform")
	private String name;
	@Element(required=false)
	private String console;
	@Element(required=false)
	private String controller;
	@Element(required=false)
	private String overview;
	@Element(required=false)
	private String developer;
	@Element(required=false)
	private String manufacturer;
	@Element(required=false)
	private String cpu;
	@Element(required=false)
	private String memory;
	@Element(required=false)
	private String graphics;
	@Element(required=false)
	private String sound;
	@Element(required=false)
	private String display;
	@Element(required=false)
	private String media;
	@Element(name="maxcontrollers", required=false)
	private String maxControllers;
	@Element(name="Rating", required=false)
	private double rating;
	@Element(name="Images", required=false)
	private PlatformImage images;
	
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

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getGraphics() {
		return graphics;
	}

	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getMaxControllers() {
		return maxControllers;
	}

	public void setMaxControllers(String maxControllers) {
		this.maxControllers = maxControllers;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public PlatformImage getImages() {
		return images;
	}

	public void setImages(PlatformImage images) {
		this.images = images;
	}

	public Platform() {
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
		this.images = new PlatformImage();
	}
}