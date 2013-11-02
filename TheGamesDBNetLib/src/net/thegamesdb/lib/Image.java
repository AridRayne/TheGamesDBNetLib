package net.thegamesdb.lib;

import javax.xml.bind.annotation.XmlAttribute;

public class Image {
	@XmlAttribute
	public int width;
	@XmlAttribute
	public int height;
	public String thumb;
}
