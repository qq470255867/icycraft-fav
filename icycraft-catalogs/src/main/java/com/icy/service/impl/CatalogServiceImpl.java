package com.icy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.CatalogRepository;
import com.icy.domain.Catalog;
import com.icy.service.CatalogService;

@Service
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	CatalogRepository catalogRepository;

	@Override
	public List<Catalog> getCataLogByUserId(Long userId) {

		return catalogRepository.getCatalogsByUserId(userId);
	}

}
