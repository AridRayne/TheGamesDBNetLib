package com.AridRayne.thegamesdb.lib.image;

import java.util.List;

import org.simpleframework.xml.ElementList;

/**
 * A class containing information about the images of a Game.
 * @author AridRayne
 *
 */
public class GameImage {
	@ElementList(inline=true, entry="fanart", required=false)
	private List<FanArt> fanart;
	@ElementList(inline=true, entry="boxart", required=false)
	private List<BoxArt> boxart;
	@ElementList(inline=true, entry="banner", required=false)
	private List<Image> banner;
	@ElementList(inline=true, entry="screenshot", required=false)
	private List<FanArt> screenshot;
	@ElementList(inline=true, entry="clearLogo", required=false)
	private List<Image> clearLogo;
	
	/**
	 * Returns a list of FanArt items with information about the fanart.
	 * @return List of FanArt items.
	 */
	public List<FanArt> getFanart() {
		return this.fanart;
	}
	
	/**
	 * Sets a list of FanArt items with information about the fanart.
	 * @param fanart List of FanArt items.
	 */
	public void setFanart(List<FanArt> fanart) {
		this.fanart = fanart;
	}
	
	/**
	 * Returns a list of BoxArt items with information about the box art.
	 * @return List of BoxArt items.
	 */
	public List<BoxArt> getBoxart() {
		return this.boxart;
	}
	
	/**
	 * Sets a list of BoxArt items with information about the box art.
	 * @param boxart List of BoxArt items.
	 */
	public void setBoxart(List<BoxArt> boxart) {
		this.boxart = boxart;
	}
	
	/**
	 * Returns a list of Image items with information about the banner images.
	 * @return List of Image items.
	 */
	public List<Image> getBanner() {
		return this.banner;
	}
	
	/**
	 * Sets a list of Image items with information about the banner images.
	 * @param banner List of Image items.
	 */
	public void setBanner(List<Image> banner) {
		this.banner = banner;
	}
	
	/**
	 * Returns a list of FanArt items with information about the screenshots.
	 * @return List of FanArt items.
	 */
	public List<FanArt> getScreenshot() {
		return this.screenshot;
	}
	
	/**
	 * Sets a list of FanArt items with information about the screenshots.
	 * @param screenshot List of FanArt items.
	 */
	public void setScreenshot(List<FanArt> screenshot) {
		this.screenshot = screenshot;
	}
	
	/**
	 * Returns a list of Image items with information about the ClearLogos.
	 * @return List of Image items.
	 */
	public List<Image> getClearLogo() {
		return this.clearLogo;
	}
	
	/**
	 * Sets a list of Image items with information about the ClearLogos.
	 * @param clearLogo List of Image items.
	 */
	public void setClearLogo(List<Image> clearLogo) {
		this.clearLogo = clearLogo;
	}
}
