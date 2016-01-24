package com.jjdevine.service.location;

/**
 * Exception class of location retrieval errors
 * @author Jonathan
 *
 */
public class LocationRetrievalException extends Exception {

	/**
	 * Constructor for exception.
	 * @param msg the exception message.
	 */
	public LocationRetrievalException(String msg) {
		super(msg);
	}

}
