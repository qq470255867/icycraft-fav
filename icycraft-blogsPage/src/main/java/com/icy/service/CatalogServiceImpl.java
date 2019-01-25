package com.icy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.CatalogFeign;
import com.icy.vo.Catalog;
@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	CatalogFeign catalogFeign;
	

	@Override
	public List<Catalog> getCatalogs(Long userId) {
		
		return catalogFeign.getCatalogs(userId);
	}

}
