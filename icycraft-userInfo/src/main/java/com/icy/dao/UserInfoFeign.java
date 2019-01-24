package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.UserInfo;

@FeignClient(name = "icycraft-author")
public interface UserInfoFeign {

	@GetMapping("/userInfo")
	public UserInfo getUserInfo(@RequestParam Long userId);
	
	
	@PostMapping("/update")
	public UserInfo updateUserInfo(UserInfo userInfo);

}
