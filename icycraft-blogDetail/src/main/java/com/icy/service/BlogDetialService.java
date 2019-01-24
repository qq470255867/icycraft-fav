package com.icy.service;

import java.util.List;

import com.icy.vo.Article;
import com.icy.vo.UserInfo;

public interface BlogDetialService {

	Article getBlogById(Long id);

	UserInfo getUserInfo(Long userId);

	List<Article> getArticleByUserId(Long userId);
	
	
	
	

}
