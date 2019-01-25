package com.icy.service;

import java.util.List;

import com.icy.vo.Catalog;

public interface CatalogService {
	
	
	public List<Catalog> getCatalogs(Long userId);

}
