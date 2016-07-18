package com.programmingfree.springservice.services;

import java.util.List;

import com.programmingfree.springservice.domain.User;



public interface UserServices {
	public boolean addUser(User User) throws Exception;
	public User getUserById(long id) throws Exception;
	public List<User> getUserList() throws Exception;
	public boolean deleteUser(long id) throws Exception;
}
