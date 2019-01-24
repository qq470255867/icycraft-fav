package com.icy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.BlogDetailFeign;
import com.icy.dao.UserInfoFeign;
import com.icy.vo.Article;
import com.icy.vo.UserInfo;

@Service
public class BlogDetialServiceImpl implements BlogDetialService {

	@Autowired
	BlogDetailFeign blogDetailFeign;

	@Autowired
	UserInfoFeign userInfoFeign;

	@Override
	public Article getBlogById(Long id) {

		return blogDetailFeign.getBlogById(id);
	}

	@Override
	public UserInfo getUserInfo(Long userId) {

		return userInfoFeign.getUserInfo(userId);
	}

	@Override
	public List<Article> getArticleByUserId(Long userId) {

		return blogDetailFeign.getArticleByUserId(userId);
	}

}
