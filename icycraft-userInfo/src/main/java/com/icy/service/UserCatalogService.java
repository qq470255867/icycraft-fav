package com.icy.service;

import java.util.List;

import com.icy.vo.Catalog;

public interface UserCatalogService {

	List<Catalog> getUserCatalog(Long UserId);

}
