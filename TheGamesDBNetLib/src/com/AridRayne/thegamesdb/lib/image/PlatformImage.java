package com.AridRayne.thegamesdb.lib.image;
import java.util.List;

import org.simpleframework.xml.ElementList;


public class PlatformImage {
	@ElementList(inline=true, entry="fanart")
	public List<FanArt> fanart;
	@ElementList(inline=true, entry="boxart")
	public List<BoxArt> boxart;
	@ElementList(inline=true, entry="banner")
	public List<Image> banner;
	@ElementList(inline=true, entry="consoleart")
	public List<String> consoleart;
	@ElementList(inline=true, entry="controllerart")
	public List<String> controllerart;
}
