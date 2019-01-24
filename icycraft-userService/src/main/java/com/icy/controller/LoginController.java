package com.icy.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.icy.service.LoginService;
import com.icy.vo.User;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/tologin")
	public String toLogin(Model model) {
		
		return "login";

	}
	
	@PostMapping("/tologin")
	public String loginCheck(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,
			Model model,User user) {
		
		User u = loginService.checkUser(user.getUserName());
		
		
		
		if (u!=null) {
			
			if (u.getPassWord().equals(user.getPassWord())) {
				Cookie cookie = new Cookie("userId", u.getId()+"");
				httpServletResponse.addCookie(cookie);
				return "redirect:http://localhost:8080";
				
			}else {
				
				model.addAttribute("msg", "用户名和密码错误！请重新登录");
				return "login";
			}
			
		}else {
			model.addAttribute("msg", "用户名和密码错误！请重新登录");
			return "login";
		}
		
	}

}
