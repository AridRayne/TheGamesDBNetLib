package com.AridRayne.thegamesdb.lib.image;
import java.util.List;

import org.simpleframework.xml.ElementList;


public class PlatformImage {
	@ElementList(inline=true, entry="fanart", required=false)
	public List<FanArt> fanart;
	@ElementList(inline=true, entry="boxart", required=false)
	public List<BoxArt> boxart;
	@ElementList(inline=true, entry="banner", required=false)
	public List<Image> banner;
	@ElementList(inline=true, entry="consoleart", required=false)
	public List<String> consoleart;
	@ElementList(inline=true, entry="controllerart", required=false)
	public List<String> controllerart;
}
