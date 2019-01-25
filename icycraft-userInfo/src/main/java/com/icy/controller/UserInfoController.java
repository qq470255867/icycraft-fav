package com.icy.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.icy.service.UserCatalogService;
import com.icy.service.UserInfoService;
import com.icy.vo.Article;
import com.icy.vo.Catalog;
import com.icy.vo.UserInfo;

@Controller
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;

	@Autowired
	UserCatalogService userCatalogService;

	private Long UserId;

	@GetMapping("/userInfo")
	public String userInfo(@RequestParam Long userId, Model model, HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();
		if (cookies!=null) {
			
			for (Cookie cookie : cookies) {
				
				Long userIdFromCookie = Long.parseLong(cookie.getValue());
				
				model.addAttribute("info", userInfoService.getUserInfo(userIdFromCookie));
			}
		}
		UserId = userId;
		
		

		model.addAttribute("userId", userId);

		UserInfo userInfo = userInfoService.getUserInfo(userId);

		List<Catalog> catalog = userCatalogService.getUserCatalog(userId);

		List<Article> articles = userInfoService.getArticles(userId);

		model.addAttribute("catalog", catalog);

		model.addAttribute("user", userInfo);

		model.addAttribute("articles", articles);

		return "about";

	}

	@PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	String avatarUpload(@RequestPart(value = "file") MultipartFile file) {
		userInfoService.avatarUpload(file);

		return "redirect:userInfo?userId=" + UserId;

	}
	
	@GetMapping("/update")
	String toPage(Model model,HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			Long userIdFromCookie = Long.parseLong(cookie.getValue());
			UserInfo info = userInfoService.getUserInfo(userIdFromCookie);
			model.addAttribute("info", info);
		}
		
		return "update";
	}
	
	
	@PostMapping("/updateUserInfo")
	public String updateUserInfo(UserInfo userInfo,HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		Long userId = null;
		for (Cookie cookie : cookies) {
			userId = Long.parseLong(cookie.getValue());
			
			userInfo.setUserId(userId);
			userInfo.setId(userId);
		}
		
		
		
		
		UserInfo info = userInfoService.getUserInfo(userId);
		
		if (userInfo.getAvatar()==null) {
			userInfo.setAvatar(info.getAvatar());
		}
		if (userInfo.getBackground()==null) {
			userInfo.setBackground(info.getBackground());
		}
	
		
		userInfoService.upDateUserInfo(userInfo);
		
		return "redirect:userInfo?userId=" + UserId;
	}

}
