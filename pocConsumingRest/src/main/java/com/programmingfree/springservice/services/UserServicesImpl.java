package com.programmingfree.springservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.programmingfree.springservice.dao.UserDao;
import com.programmingfree.springservice.domain.User;




public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao dataDao;
	
	@Override
	public boolean addUser(User User) throws Exception {
		return dataDao.addUser(User);
	}

	@Override
	public User getUserById(long id) throws Exception {
		return dataDao.getUserById(id);
	}

	@Override
	public List<User> getUserList() throws Exception {
		return dataDao.getUserList();
	}

	@Override
	public boolean deleteUser(long id) throws Exception {
		return dataDao.deleteUser(id);
	}

}
