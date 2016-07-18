package com.programmingfree.springservice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.programmingfree.springservice.domain.User;


public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addUser(User User) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(User);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public User getUserById(long id) throws Exception {
		session = sessionFactory.openSession();
		User User = (User) session.load(User.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return User;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<User> UserList = session.createCriteria(User.class)
				.list();
		tx.commit();
		session.close();
		return UserList;
	}
	
	@Override
	public boolean deleteUser(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(User.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

}
