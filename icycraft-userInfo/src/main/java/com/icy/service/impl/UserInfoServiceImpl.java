package com.icy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.icy.dao.UserArticlesFeign;
import com.icy.dao.UserInfoFeign;
import com.icy.dao.UserPicFeign;
import com.icy.service.UserInfoService;
import com.icy.util.FileTransUtile;
import com.icy.vo.Article;
import com.icy.vo.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoFeign userInfoFeign;

	@Autowired
	UserPicFeign userPicFeign;

	@Autowired
	UserArticlesFeign userArticlesFeign;

	@Override
	public UserInfo getUserInfo(Long userId) {

		return userInfoFeign.getUserInfo(userId);
	}

	@Override
	public List<Article> getArticles(Long userId) {

		return userArticlesFeign.getArticleByUserId(userId);
	}

	@Override
	public String avatarUpload(MultipartFile file) {

		String dest = FileTransUtile.transto(file);

		return userPicFeign.fileUpload(dest);
	}

	@Override
	public UserInfo upDateUserInfo(UserInfo userInfo) {
		
		return userInfoFeign.updateUserInfo(userInfo);
	}

}
