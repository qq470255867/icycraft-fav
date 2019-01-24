package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.utils.PageInfo;
import com.icy.vo.Article;

@FeignClient(name = "icycraft-articles")
public interface ArticleByCatFeigin {
	@GetMapping("/article/blogBycat")
	PageInfo<Article> getArticleByCid(@RequestParam Long catId,@RequestParam int page);
	
	

}
