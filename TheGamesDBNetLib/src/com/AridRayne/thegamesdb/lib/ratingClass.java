package com.AridRayne.thegamesdb.lib;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

/**
 * A class that contains info about the rating of a Game or Platform.
 * @author AridRayne
 *
 */
@Root(name="Data")
public class ratingClass {
	@Path("game")
	@Element(name="Rating")
	private double rating;

	/**
	 * Returns the rating.
	 * @return The rating.
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * Sets the rating.
	 * @param rating The rating.
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
}
