package com.icy.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.icy.service.BlogEditService;
import com.icy.vo.Article;
import com.icy.vo.Catalog;

@Controller
public class BlogEditController {

	@Autowired
	BlogEditService blogEditService;
	long userId;

	@GetMapping("/")
	public String toPage(Model model, HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return "redirect:http://localhost:8084/tologin";
		} else {

			for (Cookie cookie : cookies) {
				userId = Long.parseLong(cookie.getValue());
			}
			List<Catalog> catalogs = blogEditService.getCatalogs(userId);

			model.addAttribute("catalogs", catalogs);

			return "simple";
		}
	}

	@PostMapping("/postBlog")
	public String postBlog(Article article) {

		article.setUserId(userId);
		blogEditService.blogSave(article);

		return "redirect:http://localhost:8080";
	}

}
