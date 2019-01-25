package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.User;
import com.icy.vo.UserInfo;


@FeignClient(name="icycraft-author")
public interface UserFeign {
	
	@RequestMapping("/User/{id}")
    public User getUserById(@PathVariable("id") long id);
	
	
	
	@GetMapping("/userInfo")
	public UserInfo getUserInfo(@RequestParam Long userId);

}
