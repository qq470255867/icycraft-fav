package com.icy.service;

import com.icy.utils.PageInfo;
import com.icy.vo.Article;
import com.icy.vo.UserInfo;

public interface ArticleByCidService {
	
	PageInfo<Article> getArticleByCid(long cid, int page);
	
	UserInfo getUserInfo(long userId);
	
	
	public PageInfo<Article> blogByCatAndUserId( Long catId, long userId,
			int page);
	
	public PageInfo<Article> blogByUserId( long userId,
			int page);

}
