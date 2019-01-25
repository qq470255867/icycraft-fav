package com.icy.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.BlogEditFeign;
import com.icy.dao.CatalogFeign;
import com.icy.vo.Article;
import com.icy.vo.Catalog;

@Service
public class BlogEditServiceImpl implements BlogEditService {

	@Autowired
	BlogEditFeign blogEditFeign;

	@Autowired
	CatalogFeign catalogFeign;

	@Override
	public Article blogSave(Article article) {

		
		
		article.setCreate_time(new Date());

		

		return blogEditFeign.blogSave(article);
	}

	@Override
	public List<Catalog> getCatalogs(Long userId) {

		return catalogFeign.getCatalogByUser_Id(userId);
	}

	@Override
	public void addCatalog(Catalog catalog) {
		catalogFeign.addCatalog(catalog);
		
	}

}
