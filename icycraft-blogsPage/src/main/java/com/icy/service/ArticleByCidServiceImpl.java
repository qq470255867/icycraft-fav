package com.icy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.ArticleByCatFeigin;
import com.icy.dao.UserFeign;
import com.icy.utils.PageInfo;
import com.icy.vo.Article;
import com.icy.vo.UserInfo;

@Service
public class ArticleByCidServiceImpl implements ArticleByCidService {

	@Autowired
	ArticleByCatFeigin articleByCatFeigin;

	@Autowired
	UserFeign userFeign;

	@Override
	public PageInfo<Article> getArticleByCid(long cid, int page) {

		return articleByCatFeigin.getArticleByCid(cid, page);
	}

	@Override
	public UserInfo getUserInfo(long userId) {

		return userFeign.getUserInfo(userId);
	}

	@Override
	public PageInfo<Article> blogByCatAndUserId(Long catId, long userId, int page) {

		return articleByCatFeigin.blogByCatAndUserId(catId, userId, page);
	}

	@Override
	public PageInfo<Article> blogByUserId(long userId, int page) {
		// TODO Auto-generated method stub
		return articleByCatFeigin.blogByUserId(userId, page);
	}

}
