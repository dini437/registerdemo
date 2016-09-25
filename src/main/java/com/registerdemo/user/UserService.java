package com.registerdemo.user;

import java.util.List;

public interface UserService {

	public void insert(User u);
	
	public void update(User u);
	
	public void delete(int uid);
	
	public User getUser(int uid);
	
	public List<User> ListUser();
}