package com.icy.service;

import com.icy.vo.User;
import com.icy.vo.UserInfo;

public interface RegisterService {

	int userRigister(User user);
	
	User getUserByUserName(String userName);
	
	void addUserInfo(UserInfo userInfo);

}
