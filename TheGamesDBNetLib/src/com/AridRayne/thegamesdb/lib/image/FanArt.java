package com.AridRayne.thegamesdb.lib.image;

import org.simpleframework.xml.Element;

public class FanArt {
	@Element(name="original")
	public Image original;
	@Element(name="thumb")
	public String thumb;
}
