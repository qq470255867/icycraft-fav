package com.icy.service;

import java.util.List;

import com.icy.domain.Catalog;
import com.icy.domain.User;

public interface UserService {
	
	//Optional<User> findUserById(int id);
	
	User findUserById(long id);
	
	List<Catalog> findCataLogs(Long userId);
	
	void AddUser(User user);
	
	User findByUserName(String UserName);
	
	

}
