package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.User;
import com.icy.vo.UserInfo;

@FeignClient(name="icycraft-author")
public interface UserFeign {
	
	@PostMapping("/User/createUser")
	int userRegister(@RequestBody User user);
	
	@GetMapping("/User/getUser")
	User getUser(@RequestParam String userName);
	
	@PostMapping("/update")
	public void updateUserInfo(@RequestBody UserInfo userInfo); 
	
	

}
