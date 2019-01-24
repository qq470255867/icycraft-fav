package com.icy.service;

import com.icy.domain.UserInfo;

public interface UserInfoService {
	
	UserInfo getUserInfoByUserId(Long UserId);
	
	void updateUserInfo(UserInfo userInfo);
}
