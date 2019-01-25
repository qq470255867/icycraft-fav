package com.icy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icy.domain.User;
import com.icy.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/{id}")
	User findUserById(@PathVariable long id) {

		User user = userService.findUserById(id);

		return user;

	}

	@PostMapping("/createUser")
	int addUser(@RequestBody User user) {

		try {

			userService.AddUser(user);
		} catch (Exception e) {
			System.out.println("服务器内部错误");
			return 500;
		}
		return 200;

	}
	
	@GetMapping("/getUser")
	User findUser(@RequestParam String userName) {
		return userService.findByUserName(userName);
		
	}
	

}
