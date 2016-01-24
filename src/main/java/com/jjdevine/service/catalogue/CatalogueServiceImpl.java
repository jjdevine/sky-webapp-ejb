package com.jjdevine.service.catalogue;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.jjdevine.entity.NewsProduct;
import com.jjdevine.entity.SportsProduct;

/**
 * Hibernate implementation of the catalogue service
 * @author Jonathan
 *
 */
@Stateless
public class CatalogueServiceImpl implements CatalogueService {
	
	/**
	 * The persistence context.
	 */
    @PersistenceContext(unitName="sky")
    private EntityManager em;

	public List<SportsProduct> getSportsProducts(long locationId) {
		
		return em.createQuery("FROM SportsProduct WHERE location_id LIKE :locationId OR location_id IS NULL", SportsProduct.class)
				.setParameter("locationId", locationId)
				.getResultList();
	}

	@Override
	public List<NewsProduct> getNewsProducts() {
		
		return em.createQuery("FROM NewsProduct", NewsProduct.class)
				.getResultList();
	}
}
