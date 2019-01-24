package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icy.vo.User;


@FeignClient(name="icycraft-author")
public interface UserFeign {
	
	@RequestMapping("/User/{id}")
    public User getUserById(@PathVariable("id") long id);

}
