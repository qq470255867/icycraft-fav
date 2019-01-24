package com.icy.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.icy.domain.Article;

public interface ArticleService {

	List<Article> getArticles();

	Page<Article> findArticlesByCatId(Long catId, Integer page);

	List<Article> getArticlesByUserId(Long userId);

	Article blogSave(Article article);
	
	Article getBlogById(Long id);
	
	Page<Article> findArticlesByCatIdAndUserId(Long catId, Long userId,Integer page);
	

}
