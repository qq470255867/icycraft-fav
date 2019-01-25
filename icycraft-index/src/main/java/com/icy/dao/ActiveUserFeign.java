package com.icy.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.icy.vo.UserInfo;


@FeignClient(name="icycraft-activeUsers")
public interface ActiveUserFeign {
	
	
	@GetMapping("/activeUser")
	public List<UserInfo> getActiveUser();

}
