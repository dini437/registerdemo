package com.registerdemo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO uDAO;
	
	public void insert(User u) {
		// TODO Auto-generated method stub
		uDAO.insert(u);
	}

	public void update(User u) {
		// TODO Auto-generated method stub
		uDAO.update(u);
	}

	public void delete(int uid) {
		// TODO Auto-generated method stub
		uDAO.delete(uid);
	}

	public User getUser(int uid) {
		// TODO Auto-generated method stub
		return uDAO.getUser(uid);
	}

	public List<User> ListUser() {
		// TODO Auto-generated method stub
		return uDAO.ListUser();
	}

}