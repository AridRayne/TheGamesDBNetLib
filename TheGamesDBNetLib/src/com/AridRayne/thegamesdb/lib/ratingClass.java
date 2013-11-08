package com.AridRayne.thegamesdb.lib;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name="Data")
public class ratingClass {
	@Path("game")
	@Element(name="Rating")
	double rating;
}
