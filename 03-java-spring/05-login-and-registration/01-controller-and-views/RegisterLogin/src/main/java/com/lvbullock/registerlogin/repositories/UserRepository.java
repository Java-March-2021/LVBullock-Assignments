package com.lvbullock.registerlogin.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lvbullock.registerlogin.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	//SELECT * FROM users
	List<User> findAll();  //make sure this import is from java.util.list
	boolean existsByEmail(String email);
	User findByEmail(String email);
}
