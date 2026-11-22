package com.ajay.Runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajay.Entity.User;
import com.ajay.Repository.UserRepo;
import com.ajay.Service.UserService;


@Component	
public class UserRunner implements CommandLineRunner {
	@Autowired
	private UserService repoo;
	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("user runner");
//		repoo.getallUserDetails().forEach(System.out::println);
//		Optional<User> op = repoo.showById(1);
//		while(op.isPresent())
//		{
//			System.out.println(op.get());
//			break;
//		}
            
		//User u1 = new User( "anusha","susaladi","anushaasusaladi@gmail.com");
//		repoo.addUser(u1);
		
	//	repoo.updateUser(1, u1);
		
	}

}
