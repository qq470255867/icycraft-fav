package com.icy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.icy.service.RegisterService;
import com.icy.vo.User;

@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;

	@GetMapping("/regist")
	String toRegister() {
		return "register";

	}

	@PostMapping("/register")
	String addUser(@ModelAttribute User user) {

		int code = registerService.userRigister(user);

		if (code == 200) {

			return "register";

		} else {

			return "404";
		}

	}

}
