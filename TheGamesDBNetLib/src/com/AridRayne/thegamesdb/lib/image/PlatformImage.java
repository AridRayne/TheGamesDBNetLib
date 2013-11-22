package com.AridRayne.thegamesdb.lib.image;
import java.util.List;

import org.simpleframework.xml.ElementList;

/**
 * A class containing information about the images of a Platform.
 * @author AridRayne
 *
 */
public class PlatformImage extends GameImage {
	@ElementList(inline=true, entry="consoleart", required=false)
	private List<String> consoleart;
	@ElementList(inline=true, entry="controllerart", required=false)
	private List<String> controllerart;
	
	/**
	 * Returns a list of urls of console art.
	 * @return List of urls of console art.
	 */
	public List<String> getConsoleart() {
		return consoleart;
	}
	
	/**
	 * Sets the list of urls of console art.
	 * @param consoleart List of urls of console art.
	 */
	public void setConsoleart(List<String> consoleart) {
		this.consoleart = consoleart;
	}
	
	/**
	 * Returns a list of urls of controller art.
	 * @return List of urls of controller art.
	 */
	public List<String> getControllerart() {
		return controllerart;
	}
	
	/**
	 * Sets the list of urls of controller art.
	 * @param controllerart List of urls of controller art.
	 */
	public void setControllerart(List<String> controllerart) {
		this.controllerart = controllerart;
	}
	
	/*
	@ElementList(inline=true, entry="fanart", required=false)
	private List<FanArt> fanart;
	@ElementList(inline=true, entry="boxart", required=false)
	private List<BoxArt> boxart;
	@ElementList(inline=true, entry="banner", required=false)
	private List<Image> banner;
	@ElementList(inline=true, entry="consoleart", required=false)
	private List<String> consoleart;
	@ElementList(inline=true, entry="controllerart", required=false)
	private List<String> controllerart;
	
	public List<FanArt> getFanart() {
		return fanart;
	}
	public void setFanart(List<FanArt> fanart) {
		this.fanart = fanart;
	}
	public List<BoxArt> getBoxart() {
		return boxart;
	}
	public void setBoxart(List<BoxArt> boxart) {
		this.boxart = boxart;
	}
	public List<Image> getBanner() {
		return banner;
	}
	public void setBanner(List<Image> banner) {
		this.banner = banner;
	}
	public List<String> getConsoleart() {
		return consoleart;
	}
	public void setConsoleart(List<String> consoleart) {
		this.consoleart = consoleart;
	}
	public List<String> getControllerart() {
		return controllerart;
	}
	public void setControllerart(List<String> controllerart) {
		this.controllerart = controllerart;
	}
	*/
}
