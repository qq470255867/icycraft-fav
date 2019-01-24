package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.UserInfo;

@FeignClient("icycraft-author")
public interface UserInfoFeign {

	@GetMapping("/userInfo")
	public UserInfo getUserInfo(@RequestParam Long userId);

}
