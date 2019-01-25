package com.icy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icy.domain.Article;
import com.icy.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@GetMapping("/indexArticle")
	public List<Article> getIndexArticles() {

		return articleService.getArticles();
	}

	@GetMapping("/blogBycat")
	public Page<Article> showArticlesByCatId(@RequestParam Long catId, Model model,
			@RequestParam(defaultValue = "0") int page) {

		Page<Article> list = articleService.findArticlesByCatId(catId, page);

		return list;
	}

	@GetMapping("/ArticlesByUserId")
	public List<Article> getArticleByUserId(@RequestParam Long userId) {
		return articleService.getArticlesByUserId(userId);

	}

	@PostMapping("/blogSave")
	public Article blogSave(@RequestBody Article article) {

		return articleService.blogSave(article);
	}

	@GetMapping("/blogById")
	public Article getBolgById(@RequestParam Long id) {

		return articleService.getBlogById(id);
	}
	
	@GetMapping("/blogByCatAndUserId")
	public Page<Article> blogByCatAndUserId(@RequestParam Long catId,@RequestParam long userId,
			@RequestParam(defaultValue = "0") int page) {

		Page<Article> list = articleService.findArticlesByCatIdAndUserId(catId, userId, page);

		return list;
	}
	
	@GetMapping("/blogByUserId")
	public Page<Article> blogByUserId(@RequestParam long userId,
			@RequestParam(defaultValue = "0") int page) {

		Page<Article> list = articleService.findArticlesByUserId(userId, page);

		return list;
	}

}
