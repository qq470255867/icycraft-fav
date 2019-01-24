package com.icy.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.Article;

@FeignClient(name = "icycraft-articles")
public interface BlogDetailFeign {

	@GetMapping("/article/blogById")
	public Article getBlogById(@RequestParam Long id);

	@GetMapping("/article/ArticlesByUserId")
	public List<Article> getArticleByUserId(@RequestParam Long userId);

}
