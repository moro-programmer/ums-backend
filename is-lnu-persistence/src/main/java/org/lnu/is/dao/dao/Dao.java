package org.lnu.is.dao.dao;

import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Interface, that has all methods, that are needed 
 * to work with entities.
 * @author ivanursul
 *
 * @param <ENTITY> Entity class.
 * @param <KEY> Identifier class.
 */
public interface Dao<ENTITY, KEY> {

	/**
	 * Method for finding Entities by Id.
	 * @param id identifier.
	 * @return Entity.
	 */
	ENTITY findById(KEY id);
	
	/**
	 * Method for saving entity.
	 * @param entity entity.
	 */
	void save(ENTITY entity);
	
	/**
	 * Method for updating entity.
	 * @param entity entity.
	 */
	void update(ENTITY entity);
	
	/**
	 * Method for deleting entity.
	 * @param entity entity.
	 */
	void delete(ENTITY entity);
	
	/**
	 * Method for getting paged Result.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<ENTITY> getEntities(PagedSearch<ENTITY> pagedSearch);
}
