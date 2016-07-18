package com.programmingfree.springservice.dao;

import java.util.List;

import com.programmingfree.springservice.domain.User;



public interface UserDao {

	public boolean addUser(User User) throws Exception;
	public User getUserById(long id) throws Exception;
	public List<User> getUserList() throws Exception;
	public boolean deleteUser(long id) throws Exception;
}
