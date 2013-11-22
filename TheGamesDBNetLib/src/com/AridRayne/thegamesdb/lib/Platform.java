package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.apache.commons.lang3.StringEscapeUtils;
import org.simpleframework.xml.Element;

import com.AridRayne.thegamesdb.lib.image.PlatformImage;

/**
 * A class that contains platform information retrieved from thegamesdb.net
 * @author AridRayne
 *
 */
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
	private String CPU;
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
	
	/**
	 * Returns the ID of the platform.
	 * @return The ID of the platform.
	 */
	public int getId() {
		return id;
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
		return StringEscapeUtils.unescapeXml(name);
	}

	/**
	 * Sets the name of the platform.
	 * @param name The name of the platform.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the console url of the platform.
	 * @return The console url of the platform.
	 */
	public String getConsole() {
		return StringEscapeUtils.unescapeXml(console);
	}

	/**
	 * Sets the console url of the platform.
	 * @param console The console url of the platform.
	 */
	public void setConsole(String console) {
		this.console = console;
	}

	/**
	 * Returns the controller url of the platform.
	 * @return The controller url of the platform.
	 */
	public String getController() {
		return StringEscapeUtils.unescapeXml(controller);
	}

	/**
	 * Sets the controller url of the platform.
	 * @param controller The controller url of the platform.
	 */
	public void setController(String controller) {
		this.controller = controller;
	}

	/**
	 * Returns the overview of the platform.
	 * @return The overview of the platform.
	 */
	public String getOverview() {
		return StringEscapeUtils.unescapeXml(overview);
	}

	/**
	 * Sets the overview of the platform.
	 * @param overview The overview of the platform.
	 */
	public void setOverview(String overview) {
		this.overview = overview;
	}

	/**
	 * Returns the developer of the platform.
	 * @return The developer of the platform.
	 */
	public String getDeveloper() {
		return StringEscapeUtils.unescapeXml(developer);
	}

	/**
	 * Sets the developer of the platform.
	 * @param developer The developer of the platform.
	 */
	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	/**
	 * Returns the manufacturer of the platform.
	 * @return The manufacturer of the platform.
	 */
	public String getManufacturer() {
		return StringEscapeUtils.unescapeXml(manufacturer);
	}

	/**
	 * Sets the manufacturer of the platform.
	 * @param manufacturer The manufacturer of the platform.
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Returns the CPU of the platform.
	 * @return The CPU of the platform.
	 */
	public String getCPU() {
		return StringEscapeUtils.unescapeXml(CPU);
	}

	/**
	 * Sets the CPU of the platform.
	 * @param CPU The CPU of the platform.
	 */
	public void setCPU(String CPU) {
		this.CPU = CPU;
	}

	/**
	 * Returns the memory of the platform.
	 * @return The memory of the platform.
	 */
	public String getMemory() {
		return StringEscapeUtils.unescapeXml(memory);
	}

	/**
	 * Sets the memory of the platform.
	 * @param memory The memory of the platform.
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}

	/**
	 * Returns the graphics of the platform.
	 * @return The graphics of the platform.
	 */
	public String getGraphics() {
		return StringEscapeUtils.unescapeXml(graphics);
	}

	/**
	 * Sets the graphics of the platform.
	 * @param graphics The graphics of the platform.
	 */
	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}

	/**
	 * Returns the sound of the platform.
	 * @return The sound of the platform.
	 */
	public String getSound() {
		return StringEscapeUtils.unescapeXml(sound);
	}

	/**
	 * Sets the sound of the platform.
	 * @param sound The sound of the platform.
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * Returns the display of the platform.
	 * @return The display of the platform.
	 */
	public String getDisplay() {
		return StringEscapeUtils.unescapeXml(display);
	}

	/**
	 * Sets the display of the platform.
	 * @param display The display of the platform.
	 */
	public void setDisplay(String display) {
		this.display = display;
	}

	/**
	 * Returns the media of the platform.
	 * @return The media of the platform.
	 */
	public String getMedia() {
		return StringEscapeUtils.unescapeXml(media);
	}

	/**
	 * Sets the media of the platform.
	 * @param media The media of the platform.
	 */
	public void setMedia(String media) {
		this.media = media;
	}

	/**
	 * Returns the max controllers of the platform.
	 * @return The max controllers of the platform.
	 */
	public String getMaxControllers() {
		return StringEscapeUtils.unescapeXml(maxControllers);
	}

	/**
	 * Sets the max controllers of the platform.
	 * @param maxControllers The max controllers of the platform.
	 */
	public void setMaxControllers(String maxControllers) {
		this.maxControllers = maxControllers;
	}

	/**
	 * Returns the rating of the platform.
	 * @return The rating of the platform.
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * Sets the rating of the platform.
	 * @param rating The rating of the platform.
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

	/**
	 * Returns the PlatformImage of the platform, this contains info about the images for this platform.
	 * @return The PlatformImage of the platform.
	 */
	public PlatformImage getImages() {
		return images;
	}

	/**
	 * Sets the PlatformImage of the platform, this contains info about the images for this platform.
	 * @param images The PlatformImage of the platform.
	 */
	public void setImages(PlatformImage images) {
		this.images = images;
	}

	public Platform() {
		this.id = 0;
		this.name = "";
		this.overview = "";
		this.developer = "";
		this.manufacturer = "";
		this.CPU = "";
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