package com.registerdemo.userrole;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	UserRoleDAO rDAO;
	
	public void insert(UserRole r) {
		// TODO Auto-generated method stub
		rDAO.insert(r);
	}

	public void update(UserRole r) {
		// TODO Auto-generated method stub
		rDAO.update(r);
	}

	public void delete(int rid) {
		// TODO Auto-generated method stub
		rDAO.delete(rid);
	}

	public UserRole getUserRole(int rid) {
		// TODO Auto-generated method stub
		return rDAO.getUserRole(rid);
	}

	public List<UserRole> ListUserRole() {
		// TODO Auto-generated method stub
		return rDAO.ListUserRole();
	}


}
