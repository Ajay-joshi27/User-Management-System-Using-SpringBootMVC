package com.ajay.Service;

import java.util.List;
import java.util.Optional;

import com.ajay.Entity.User;

public interface IUserService {

	//fetch all users from database
	public List<User>  getallUserDetails();
	
	//get user by user id 
	public Optional<User> showById(Integer id);
	
	//add user to database
	public void addUser(User user);
	
	public void updateUser(Integer id,User user);
	
	public void deleteUser(Integer id);
}
