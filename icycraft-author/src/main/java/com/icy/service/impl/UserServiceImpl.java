package com.icy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.domain.Catalog;
import com.icy.domain.User;
import com.icy.repository.UserRepository;
import com.icy.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User findUserById(long id) {
		User user = userRepository.findUserById(id);
		return user;
	}

	@Override
	public List<Catalog> findCataLogs(Long userId) {

		return userRepository.findCatalogsById(userId);
	}

	@Override
	public void AddUser(User user) {

		userRepository.save(user);

	}

	@Override
	public User findByUserName(String userName) {

		return userRepository.findUserByUserName(userName);
	}

}
