package com.icy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icy.domain.UserInfo;
import com.icy.service.UserInfoService;

/*
 * 假如我年少有为知进退
 */

@RestController
public class UserInfoController {
	
	@Autowired
	UserInfoService userInfoService;
	
	@GetMapping("/userInfo")
	public UserInfo getUserInfo(@RequestParam Long userId) {
		
		return userInfoService.getUserInfoByUserId(userId);
	}
	
	@PostMapping("/update")
	public void updateUserInfo(@RequestBody UserInfo userInfo) {
		
		System.out.println(userInfo.toString());
		
		
		userInfoService.updateUserInfo(userInfo);
	}

}
