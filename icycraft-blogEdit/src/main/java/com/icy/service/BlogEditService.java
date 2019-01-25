package com.icy.service;

import java.util.List;

import com.icy.vo.Article;
import com.icy.vo.Catalog;

public interface BlogEditService {

	Article blogSave(Article article);

	List<Catalog> getCatalogs(Long userId);
	
	
	void addCatalog(Catalog catalog);

}
