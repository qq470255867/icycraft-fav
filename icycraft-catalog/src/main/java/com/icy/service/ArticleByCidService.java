package com.icy.service;

import com.icy.utils.PageInfo;
import com.icy.vo.Article;
import com.icy.vo.User;

public interface ArticleByCidService {
	
	PageInfo<Article> getArticleByCid(long cid, int page);
	
	User getUserInfo(long userId);

}
