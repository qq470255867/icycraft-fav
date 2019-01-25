package com.icy.service;

import java.util.List;

import com.icy.domain.Catalog;

public interface CatalogService {
	
	List<Catalog> getCataLogByUserId(Long userId);
	
	void addCatalog(Catalog catalog);
	
	Catalog getCatalogById(Long id);

}
