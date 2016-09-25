package com.registerdemo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

	@Autowired
	
	public void insert(User u);
	
	public void update(User u);
	
	public void delete(int uid);
	
	public User getUser(int uid);
	
	public List<User> ListUser();
	
}