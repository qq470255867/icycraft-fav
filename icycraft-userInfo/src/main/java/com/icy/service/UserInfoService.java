package com.icy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.icy.vo.Article;
import com.icy.vo.UserInfo;

public interface UserInfoService {

	UserInfo getUserInfo(Long userId);

	List<Article> getArticles(Long userId);

	String avatarUpload(@RequestParam MultipartFile file);
	
	UserInfo upDateUserInfo(UserInfo userInfo);
	

}
