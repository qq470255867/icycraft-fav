package com.icy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.UserFeign;
import com.icy.vo.User;
import com.icy.vo.UserInfo;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	UserFeign registerFeign;

	@Override
	public int userRigister(User user) {

		try {

			registerFeign.userRegister(user);

			return 200;
		} catch (Exception e) {
			e.printStackTrace();
			return 500;
		}

	}

	@Override
	public User getUserByUserName(String userName) {

		return registerFeign.getUser(userName);
	}

	@Override
	public void addUserInfo(UserInfo userInfo) {
		registerFeign.updateUserInfo(userInfo);

	}

}
