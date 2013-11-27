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
	private List<String> consoleArt;
	@ElementList(inline=true, entry="controllerart", required=false)
	private List<String> controllerArt;
	
	/**
	 * Returns a list of urls of console art.
	 * @return List of urls of console art.
	 */
	public List<String> getConsoleArt() {
		return this.consoleArt;
	}
	
	/**
	 * Sets the list of urls of console art.
	 * @param consoleArt List of urls of console art.
	 */
	public void setConsoleArt(List<String> consoleart) {
		this.consoleArt = consoleart;
	}
	
	/**
	 * Returns a list of urls of controller art.
	 * @return List of urls of controller art.
	 */
	public List<String> getControllerArt() {
		return this.controllerArt;
	}
	
	/**
	 * Sets the list of urls of controller art.
	 * @param controllerArt List of urls of controller art.
	 */
	public void setControllerArt(List<String> controllerArt) {
		this.controllerArt = controllerArt;
	}
}
