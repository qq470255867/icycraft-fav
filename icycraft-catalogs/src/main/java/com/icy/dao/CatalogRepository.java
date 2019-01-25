package com.icy.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.icy.domain.Catalog;

public interface CatalogRepository extends CrudRepository<Catalog, Serializable> {

	List<Catalog> getCatalogsByUserId(Long userId);

	
	@Query(value = "SELECT * from catalog where id=?1 ", nativeQuery = true)
	Catalog getCatalogById(Long Id);

}
