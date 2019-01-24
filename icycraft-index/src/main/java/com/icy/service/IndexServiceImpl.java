package com.icy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.ArticleFeign;
import com.icy.dao.UserFeign;
import com.icy.vo.Article;
import com.icy.vo.User;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	ArticleFeign feignIndexService;

	@Autowired
	UserFeign userFeign;

	@Override
	public List<Article> getIndexArticles() {

		List<Article> articles = feignIndexService.getIndexArticles();

		return articles;
	}

	@Override
	public User getUserById(long id) {

		return userFeign.getUserById(id);
	}

}
