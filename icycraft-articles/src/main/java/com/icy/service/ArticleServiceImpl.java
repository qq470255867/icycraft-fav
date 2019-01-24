package com.icy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.icy.domain.Article;
import com.icy.repository.ArticleCrudRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleCrudRepository articleCrud;

	@Override
	public List<Article> getArticles() {

		List<Article> articles = articleCrud.findIndexArticles();

		return articles;
	}

	@Override
	public Page<Article> findArticlesByCatId(Long catId, Integer start) {

		start = start < 0 ? 0 : start;

		Sort sort = new Sort(Sort.Direction.DESC, "id");

		Pageable pageable = PageRequest.of(start, 8, sort);

		Page<Article> articlesBycatId = articleCrud.findBycatId(catId, pageable);

		return articlesBycatId;
	}

	@Override
	public List<Article> getArticlesByUserId(Long userId) {

		return articleCrud.getArticlesByUserId(userId);
	}

	@Override
	public Article blogSave(Article article) {

		return articleCrud.save(article);
	}

	@Override
	public Article getBlogById(Long id) {
		
		return articleCrud.getArticleById(id);
	}

	@Override
	public Page<Article> findArticlesByCatIdAndUserId(Long catId, Long userId, Integer start) {
		start = start < 0 ? 0 : start;

		Sort sort = new Sort(Sort.Direction.DESC, "id");

		Pageable pageable = PageRequest.of(start, 8, sort);

		Page<Article> articlesBycatId = articleCrud.findArticlesByUserIdAndCatId(userId, catId, pageable);
		return articlesBycatId;
	}

}
