package com.icy.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.icy.domain.Catalog;
import com.icy.domain.User;



public interface UserRepository extends CrudRepository<User,Serializable>{
	
	User findUserById(long id);
	
	List<Catalog> findCatalogsById(Long Id);
	
	User findUserByUserName(String userName);
	
	

}
