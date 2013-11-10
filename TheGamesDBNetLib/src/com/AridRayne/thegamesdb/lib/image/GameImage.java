package com.AridRayne.thegamesdb.lib.image;

import java.util.List;

import org.simpleframework.xml.ElementList;

public class GameImage {
	@ElementList(inline=true, entry="fanart")
	public List<FanArt> fanart;
	@ElementList(inline=true, entry="boxart")
	public List<BoxArt> boxart;
	@ElementList(inline=true, entry="banner")
	public List<Image> banner;
	@ElementList(inline=true, entry="screenshot", required=false)
	public List<FanArt> screenshot;
	@ElementList(inline=true, entry="clearlogo", required=false)
	public List<Image> clearlogo;
}
