package com.AridRayne.thegamesdb.lib.image;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Image {
	@Attribute(required=false)
	public int width;
	@Attribute(required=false)
	public int height;
	@Text
	public String url;
}
