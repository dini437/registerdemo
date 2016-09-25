package com.registerdemo.userrole;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableTransactionManagement
public class UserRoleDAOImpl implements UserRoleDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void insert(UserRole r) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(r);
	}

	@Transactional
	public void update(UserRole r) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(r);
	}

	@Transactional
	public void delete(int rid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("delete from Userrole r where r.id = id").setInteger("id", rid).executeUpdate();
	}

	@Transactional
	public UserRole getUserRole(int rid) {
		// TODO Auto-generated method stub
		List<UserRole> list = sessionFactory.getCurrentSession().createQuery("from UserRole r where r.Role = :id").setInteger("id", rid).list();
		
		if (!list.isEmpty())
		{
			return list.get(0);
		}else
			return null;
	}

	@Transactional
	public List<UserRole> ListUserRole() {
		// TODO Auto-generated method stub
		List<UserRole> list =sessionFactory.getCurrentSession().createQuery("from userrole r").list();
		return null;
	}

}