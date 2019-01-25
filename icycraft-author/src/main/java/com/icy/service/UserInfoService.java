package com.icy.service;

import java.util.List;

import com.icy.domain.UserInfo;

public interface UserInfoService {

	UserInfo getUserInfoByUserId(Long UserId);

	void updateUserInfo(UserInfo userInfo);

	List<UserInfo> getAllUser();
}
