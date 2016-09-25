package com.registerdemo.user;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableTransactionManagement
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void insert(User u) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(u);
	}

	@Transactional
	public void update(User u) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(u);
	}

	@Transactional
	public void delete(int uid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("delete from user u where u.id = :id").setInteger("id", uid).executeUpdate();
	}

	@Transactional
	public User getUser(int uid) {
		// TODO Auto-generated method stub
		List<User> list = sessionFactory.getCurrentSession().createQuery("from User u where u.id").setInteger("id", uid).list();
		
		if(!list.isEmpty())
		{
			return list.get(0);
		}else
		return null;
	}

	@Transactional
	public List<User> ListUser() {
		// TODO Auto-generated method stub
		List<User> list = sessionFactory.getCurrentSession().createQuery("from User u").list();
		return list;
	}

}