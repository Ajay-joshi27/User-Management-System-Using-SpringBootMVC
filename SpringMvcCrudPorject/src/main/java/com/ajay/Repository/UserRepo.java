package com.ajay.Repository;

import com.ajay.Controller.UserController;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ajay.Entity.User;
@Component
public class UserRepo {

	@Autowired
	private IUserRepo repo;

	//get all user 
	/*
	 * 
	 * 
	 */
	public List<User> showRecords() {
		return repo.findAll();
	}
	
	
	//get user by id
/**
 * 
 * @param id
 * @return  optional api
 */
	public Optional<User> findByIdNumber(Integer id) {
		return repo.findById(id);
	}
	
	//add single user
	/**
	 * 
	 * @param user
	 * @return  User
	 */
	public void addUser(User user) {
			 repo.save(user);
	}
	
	
		

public void updateUser(Integer id, User user) {

    User existingUser = repo.findById(id)
            .orElseThrow(() ->
                new RuntimeException("User not found"));

    existingUser.setFirstname(user.getFirstname());
    existingUser.setLastname(user.getLastname());
    existingUser.setGmail(user.getGmail());
    
    repo.save(existingUser);
}

/**
 * 
 * @param id
 * delete user based upon id
 */
public void deleteUser(Integer id) {

    if (!repo.existsById(id)) {
        throw new RuntimeException("User not found with ID: " + id);
    }

    repo.deleteById(id);
}

		
	}
	