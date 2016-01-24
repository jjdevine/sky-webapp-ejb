package com.jjdevine.service.catalogue;

import java.util.List;

import com.jjdevine.entity.NewsProduct;
import com.jjdevine.entity.SportsProduct;

/**
 * Catalogue service for product lookup.
 * @author Jonathan
 */
public interface CatalogueService {

	/**
	 * Return a list of sports products applicable to the location id specified.
	 * @param locationId the location id.
	 * @return a list of sports products.
	 */
	List<SportsProduct> getSportsProducts(long locationId);
	
	/**
	 * Return a list of news products.
	 * @return a list of news products.
	 */
	List<NewsProduct> getNewsProducts();
}
