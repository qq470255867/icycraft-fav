package com.icy.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icy.service.IndexService;
import com.icy.vo.Article;
import com.icy.vo.Catalog;
import com.icy.vo.UserInfo;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;

	@RequestMapping("/")
	public String toIndex(HttpServletRequest request, HttpServletResponse response, Model model) {

		List<Article> articles = indexService.getIndexArticles();

		Cookie[] cookies = request.getCookies();
		Long userId = null;
		if (cookies != null) {

			for (Cookie cookie : cookies) {

				userId = Long.valueOf(cookie.getValue());
			}
			UserInfo loginUser = indexService.getUserById(userId);

			model.addAttribute("loginUser", loginUser);
		}

		Integer i = Integer.valueOf(0);

		for (Article article : articles) {
			i++;

			UserInfo user = indexService.getUserById(article.getUserId());

			Catalog catalog = indexService.getCatalogById(article.getCatId());

			model.addAttribute("cat" + i, catalog);

			model.addAttribute("title" + i, article.getTitle());

			model.addAttribute("date" + i, article.getCreate_time().toInstant());

			model.addAttribute("author" + i, user.getName());
			
			model.addAttribute("uid" + i, user.getId());
			
			

			model.addAttribute("url" + i, "http://localhost:8089/blogDetail?id=" + article.getId());

		}

		List<UserInfo> activeUser = indexService.getActiveUser();

		model.addAttribute("activeUser", activeUser);

		return "index";

	}
}
