package com.ajay.Service;

import com.ajay.Repository.IUserRepo;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.Entity.User;
import com.ajay.Repository.UserRepo;

@Service
public class UserService implements IUserService {
	

	@Autowired
	private UserRepo userrepo;
	

	
	public List<User>  getallUserDetails(){
		return userrepo.showRecords();
	}

	public Optional<User> showById(Integer id) {
		return userrepo.findByIdNumber(id);
	}

	
	public void addUser(User user) {
		userrepo.addUser(user);
	}
	
	public void updateUser(Integer id,User user) {
		System.out.println("UserService.updateUser()");
		if (user!=null && id!=null) {
			userrepo.updateUser(id, user);
		}
		else {
			throw new RuntimeException("error occured while updating user pls check properly");
		}
	}

	
	
	public void deleteUser(Integer id) {
			userrepo.deleteUser(id);
	}
	
	
	
	
	
	

}
