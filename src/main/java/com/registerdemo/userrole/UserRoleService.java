package com.registerdemo.userrole;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleService {

@Autowired
	
	public void insert(UserRole r);
	
	public void update(UserRole r);
	
	public void delete(int rid);
	
	public UserRole getUserRole(int rid);

	public List<UserRole> ListUserRole();

}