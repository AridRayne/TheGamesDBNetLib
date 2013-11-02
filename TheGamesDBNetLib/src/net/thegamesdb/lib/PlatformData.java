package net.thegamesdb.lib;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Data")
public class PlatformData {
	@XmlElement(name="Platform")
	public PlatformItem platform;
	@XmlElement(name="baseImgUrl")
	public String baseImgUrl;
	
	public PlatformData() {
		this.baseImgUrl = "";
		this.platform = new PlatformItem();
	}
}
