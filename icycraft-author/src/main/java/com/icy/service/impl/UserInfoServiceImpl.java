package com.icy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.domain.UserInfo;
import com.icy.repository.UserInfoRepository;
import com.icy.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoRepository userInfoRepository;

	@Override
	public UserInfo getUserInfoByUserId(Long userId) {

		return userInfoRepository.getUserInfoByUserId(userId);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println(userInfo.toString());
		//userInfoRepository.updateUserInfoByUserId(userInfo.getName(), userInfo.getAvatar(), userInfo.getBackground(), userInfo.getSignature(), userInfo.getSelf_introduce(), userInfo.getBirthday(), userInfo.getGender(), userInfo.getAddress(), userInfo.getId());
		userInfoRepository.save(userInfo);
		
		System.out.println(userInfo.toString());
		
	}

}
