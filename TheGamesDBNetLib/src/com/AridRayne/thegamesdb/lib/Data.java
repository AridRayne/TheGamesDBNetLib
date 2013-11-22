package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementUnion;

public class Data<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5504421083287971252L;
	@ElementUnion({
		@Element(name="baseImgUrl"),
		@Element(name="basePlatformUrl")
	})
	private String baseUrl;
	@ElementListUnion({
		@ElementList(entry="Game", type=Game.class, inline=true),
		@ElementList(entry="Platform", type=Platform.class, inline=true),
	})
	private List<T> items;
	
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public List<T> getItems() {
		return items;
	}
	public void setItems(List<T> items) {
		this.items = items;
	}
	public T getItem(int Position) {
		return this.items.get(Position);
	}
}
