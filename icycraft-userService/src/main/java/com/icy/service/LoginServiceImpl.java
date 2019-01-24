package com.icy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.UserFeign;
import com.icy.vo.User;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserFeign loginFeign;

	@Override
	public User checkUser(String userName) {
		
		User user;
		try {
			
			user=loginFeign.getUser(userName);
			
			return user;
		} catch (Exception e) {
			
			return null;
		}
		
	}

}
