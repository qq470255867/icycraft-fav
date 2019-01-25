package com.icy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.ActiveUserFeign;
import com.icy.dao.ArticleFeign;
import com.icy.dao.CatalogFeign;
import com.icy.dao.UserFeign;
import com.icy.vo.Article;
import com.icy.vo.Catalog;
import com.icy.vo.User;
import com.icy.vo.UserInfo;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	ArticleFeign feignIndexService;

	@Autowired
	UserFeign userFeign;

	@Autowired
	ActiveUserFeign activeUserFeign;

	@Autowired
	CatalogFeign catalogFeign;

	@Override
	public List<Article> getIndexArticles() {

		List<Article> articles = feignIndexService.getIndexArticles();

		return articles;
	}

	@Override
	public UserInfo getUserById(long id) {

		return userFeign.getUserInfo(id);
	}

	@Override
	public List<UserInfo> getActiveUser() {

		return activeUserFeign.getActiveUser();
	}

	@Override
	public Catalog getCatalogById(Long id) {
		return catalogFeign.getCatalogById(id);
	}

}
