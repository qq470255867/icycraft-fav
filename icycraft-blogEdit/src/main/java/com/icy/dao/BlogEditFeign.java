package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.icy.vo.Article;

@FeignClient(name = "icycraft-articles")
public interface BlogEditFeign {

	@PostMapping("/article/blogSave")
	public Article blogSave(@RequestBody Article article);
	
	

}
