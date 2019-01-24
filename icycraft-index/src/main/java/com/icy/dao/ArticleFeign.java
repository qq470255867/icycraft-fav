package com.icy.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icy.vo.Article;

@FeignClient(name="icycraft-articles")
public interface ArticleFeign {
	

    @RequestMapping("/article/indexArticle")
    public List<Article> getIndexArticles();

}
