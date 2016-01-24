package com.jjdevine.service.location;

import javax.ejb.Stateless;

/**
 * Hibernate implementation of customer location service.
 * @author Jonathan
 *
 */
@Stateless
public class CustomerLocationServiceImpl implements CustomerLocationService {

	@Override
	public long getLocationId(long customerId) throws LocationRetrievalException {
		
		if(customerId <= 0) {
			throw new LocationRetrievalException("Unable to find location for customer with ID <" + customerId + ">");
		} else if(customerId < 100) {
			return 1;
		} else if(customerId < 200) {
			return 2;
		} else {
			return 3;
			
		}
	}
}
