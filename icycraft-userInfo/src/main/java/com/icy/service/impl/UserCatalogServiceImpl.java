package com.icy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.UserCatalaogFeign;
import com.icy.service.UserCatalogService;
import com.icy.vo.Catalog;
@Service
public class UserCatalogServiceImpl implements UserCatalogService {

	@Autowired
	UserCatalaogFeign userCatalaogFeign;

	@Override
	public List<Catalog> getUserCatalog(Long userId) {

		return userCatalaogFeign.getCatalogs(userId);
	}

}
