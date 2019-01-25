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
	
	@GetMapping("/article/blogByCatAndUserId")
	public PageInfo<Article> blogByCatAndUserId(@RequestParam Long catId,@RequestParam long userId,
			@RequestParam(defaultValue = "0") int page);
	
	
	@GetMapping("/article/blogByUserId")
	public PageInfo<Article> blogByUserId(@RequestParam long userId,
			@RequestParam(defaultValue = "0") int page);

}
