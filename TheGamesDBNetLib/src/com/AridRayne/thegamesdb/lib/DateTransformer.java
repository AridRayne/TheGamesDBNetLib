package com.AridRayne.thegamesdb.lib;

import java.text.DateFormat;
import java.util.Date;

import org.simpleframework.xml.transform.Transform;

/**
 * A simple Transform class to work with thegamesdb.net date format of MM/DD/YYYY
 * @author AridRayne
 *
 */
public class DateTransformer implements Transform<Date> {
	private DateFormat dateFormat;
	
	public DateTransformer(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	@Override
	public Date read(String arg0) throws Exception {
		return dateFormat.parse(arg0);
	}

	@Override
	public String write(Date arg0) throws Exception {
		return dateFormat.format(arg0);
	}
}
