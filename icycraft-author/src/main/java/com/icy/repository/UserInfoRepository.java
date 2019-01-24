package com.icy.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.icy.domain.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Serializable> {

	UserInfo getUserInfoByUserId(Long user_id);

//	@Modifying(clearAutomatically = true)
//	@Transactional
//	@Query(value = "update user_info u set u.Name =:name ,u.avatar=:avatar,u.background=:background,u.signature=:signature,u.self_introduce=:self_introduce,u.birthday=:birthday,u.gender=:gender,u.address=:address where u.user_id =:user_id", nativeQuery = true)
//	int updateUserInfoByUserId(@Param("name")String Name, @Param("avatar")String avatar, @Param("background")String background, @Param("signature")String signature,
//			@Param("self_introduce")String self_introduce, @Param("birthday")String birthday, @Param("gender")String gender, @Param("address")String address, @Param("user_id")Long userId);

}
