package com.icy.service;

import java.util.List;

import com.icy.vo.Article;
import com.icy.vo.User;

public interface IndexService {
	
	 List<Article> getIndexArticles();
	 
	 User getUserById(long id);

}
