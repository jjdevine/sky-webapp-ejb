package com.jjdevine.service.location;

/**
 * Service for customer location lookups.
 * @author Jonathan
 *
 */
public interface CustomerLocationService {

	/**
	 * Return the location id for the specified customer.
	 * @param customerId the customer id.
	 * @return the location id.
	 * @throws LocationRetrievalException if location cannot be looked up.
	 */
	long getLocationId(long customerId) throws LocationRetrievalException;
}
