package com.icy.service;

import java.util.List;

import com.icy.vo.Article;
import com.icy.vo.Catalog;
import com.icy.vo.User;
import com.icy.vo.UserInfo;

public interface IndexService {
	
	 List<Article> getIndexArticles();
	 
	 UserInfo getUserById(long id);
	 
	 public List<UserInfo> getActiveUser();
	 
	 public Catalog getCatalogById(Long id);
	 

}
