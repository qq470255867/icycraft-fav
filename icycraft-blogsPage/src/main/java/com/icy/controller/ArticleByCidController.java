package com.icy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.service.ArticleByCidService;
import com.icy.utils.PageInfo;
import com.icy.vo.Article;
import com.icy.vo.User;

@Controller
public class ArticleByCidController {
	
	@Autowired
	ArticleByCidService articleByCidService;
	
	
	
	@RequestMapping("/blogBycat")	
	public String toArticlesByCid(Model model,@RequestParam long catId ,@RequestParam int page) {
		
		PageInfo<Article> pageInfo = articleByCidService.getArticleByCid(catId, page);
		Integer i = Integer.valueOf(1);
		
		
		for (Article article : pageInfo.getContent()) {
			
			User user = articleByCidService.getUserInfo(article.getUserId());
			model.addAttribute("title"+i, article.getTitle());
			
			model.addAttribute("author"+i, user.getName());
			
			i++;
			
		}
		model.addAttribute("pageNum", page);
		model.addAttribute("totalPage", pageInfo.getSize());
		model.addAttribute("curcat", catId);
		
		return "blogBycat";
	}

}
