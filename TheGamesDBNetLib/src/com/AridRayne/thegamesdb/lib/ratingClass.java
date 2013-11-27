package com.AridRayne.thegamesdb.lib;

import java.io.Serializable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

/**
 * A class that contains info about the rating of a Game or Platform.
 * @author AridRayne
 *
 */
@Root(name="Data")
public class ratingClass implements Serializable{
	private static final long serialVersionUID = 7213685791384722888L;
	@Path("game")
	@Element(name="Rating")
	private double rating;

	/**
	 * Returns the rating.
	 * @return The rating.
	 */
	public double getRating() {
		return this.rating;
	}

	/**
	 * Sets the rating.
	 * @param rating The rating.
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
}
