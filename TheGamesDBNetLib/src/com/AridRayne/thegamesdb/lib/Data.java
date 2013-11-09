package com.AridRayne.thegamesdb.lib;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Root;

@Root
public class Data<T> {
	@ElementUnion({
		@Element(name="baseImgUrl"),
		@Element(name="basePlatformUrl")
	})
	public String baseUrl;
	@ElementListUnion({
		@ElementList(entry="Game", type=GameItem.class, inline=true),
		@ElementList(entry="Platform", type=PlatformItem.class, inline=true),
	})
	public List<T> items;
}
