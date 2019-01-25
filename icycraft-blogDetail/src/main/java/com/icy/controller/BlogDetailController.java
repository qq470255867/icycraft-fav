package com.icy.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.service.BlogDetialService;
import com.icy.service.CommentService;
import com.icy.vo.Article;
import com.icy.vo.Comment;
import com.icy.vo.CommentWithUserName;
import com.icy.vo.UserInfo;

@Controller
public class BlogDetailController {

	@Autowired
	BlogDetialService blogDetialService;

	@Autowired
	CommentService commentService;

	Long blogId;

	@GetMapping("/blogDetail")
	public String toBlogDetail(@RequestParam Long id, Model model,HttpServletRequest request) {

		
		
		
		blogId = id;
		
		
		Cookie[] cookies = request.getCookies();
		
		UserInfo loginUser= null;
		if (cookies!=null) {
			
			for (Cookie cookie : cookies) {
				long userId = Long.parseLong(cookie.getValue());
				loginUser = blogDetialService.getUserInfo(userId);
			}
		}
		model.addAttribute("info", loginUser);

		Article article = blogDetialService.getBlogById(id);

		UserInfo userInfo = blogDetialService.getUserInfo(article.getUserId());

		List<Article> articleByUserId = blogDetialService.getArticleByUserId(article.getUserId());

		List<Comment> commnets = commentService.getCommnets(id);

		List<CommentWithUserName> commnetList = new ArrayList<>();
		for (Comment comment : commnets) {
			Long userId = comment.getUserId();

			UserInfo info = blogDetialService.getUserInfo(userId);

			commnetList.add(new CommentWithUserName(comment, info.getName(), info.getAvatar()));

		}

		model.addAttribute("commnetList", commnetList);

		model.addAttribute("user", userInfo);

		model.addAttribute("article", article);

		model.addAttribute("articleList", articleByUserId);

		return "blogdetail";
	}

	@PostMapping(value = "/saveComment")
	public String saveComment(Comment comment, HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();
		if (cookies == null) {

			return "redirect:http://localhost:8084/tologin";
		}

		for (Cookie cookie : cookies) {
			long userId = Long.parseLong(cookie.getValue());
			comment.setUserId(userId);
		}
		comment.setBlogId(blogId);
		comment.setCreateTime(new Date());

		commentService.saveCommnet(comment);

		return "redirect:http://localhost:8089/blogDetail?id=" + blogId;

	}

}
