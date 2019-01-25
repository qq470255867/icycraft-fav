package com.icy.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.service.ArticleByCidService;
import com.icy.service.CatalogService;
import com.icy.utils.PageInfo;
import com.icy.vo.Article;
import com.icy.vo.Catalog;
import com.icy.vo.UserInfo;

@Controller
public class ArticleByCidController {

	@Autowired
	ArticleByCidService articleByCidService;

	@Autowired
	CatalogService catalogService;

	Long loginUserId;

	@RequestMapping("/blogByUserId")
	public String toArticlesByCidAndUserId(Model model, @RequestParam long userId, @RequestParam int page,
			HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {

				loginUserId = Long.parseLong(cookie.getValue());

			}

		}
		if (loginUserId != null) {
			UserInfo info = articleByCidService.getUserInfo(loginUserId);

			model.addAttribute("info", info);
		}

		PageInfo<Article> pageInfo = articleByCidService.blogByUserId(userId, page);
		Integer i = Integer.valueOf(1);

		for (Article article : pageInfo.getContent()) {

			UserInfo user = articleByCidService.getUserInfo(article.getUserId());
			model.addAttribute("article" + i, article);

			model.addAttribute("author" + i, user);

			i++;

		}
		model.addAttribute("id", userId);
		model.addAttribute("pageNum", page);
		model.addAttribute("totalPage", pageInfo.getSize());

		model.addAttribute("TotalElements", pageInfo.getTotalElements());

		List<Catalog> catalogs = catalogService.getCatalogs(userId);
		model.addAttribute("catalogs", catalogs);

		return "blogByUserId";
	}

	@RequestMapping("/blogBycat")
	public String toArticlesByUserId(Model model, @RequestParam long userId, @RequestParam long catId,
			@RequestParam int page, HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {

			for (Cookie cookie : cookies) {

				loginUserId = Long.parseLong(cookie.getValue());

			}
		}

		if (loginUserId != null) {
			UserInfo info = articleByCidService.getUserInfo(loginUserId);

			model.addAttribute("info", info);
		}

		PageInfo<Article> pageInfo = articleByCidService.blogByCatAndUserId(catId, userId, page);
		Integer i = Integer.valueOf(1);

		for (Article article : pageInfo.getContent()) {

			UserInfo user = articleByCidService.getUserInfo(article.getUserId());
			model.addAttribute("article" + i, article);

			model.addAttribute("author" + i, user);

			i++;

		}
		model.addAttribute("id", userId);
		model.addAttribute("pageNum", page);
		model.addAttribute("totalPage", pageInfo.getSize());

		model.addAttribute("TotalElements", pageInfo.getTotalElements());
		model.addAttribute("curcat", catId);

		List<Catalog> catalogs = catalogService.getCatalogs(userId);
		model.addAttribute("catalogs", catalogs);

		return "blogBycat";
	}

}
