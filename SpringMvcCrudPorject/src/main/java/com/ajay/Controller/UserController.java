
package com.ajay.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajay.Entity.User;
import com.ajay.Service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	// Open registration form
	@GetMapping("/register")
	public String showForm(Model model) {

		model.addAttribute("user", new User());

		return "register";
	}

	// Receive form data and save user
	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") User user) {

		service.addUser(user);

		return "redirect:/user/register";
	}

	// Fetch all users from database
	@GetMapping("/all")
	public String showAllUsers(Model model) {

		List<User> users = service.getallUserDetails();

		model.addAttribute("users", users);

		return "users";
	}
	
	@PostMapping(value ="/delete" )
	public String deleteUser(Model model,@ModelAttribute User user,@RequestParam("id") Integer id) {
		service.deleteUser(id);
		return "redirect:/user/all";
	}
	
	@PostMapping(value ="/update" )
	public String UpdateUser(Model model,@ModelAttribute User user,@RequestParam("id") Integer id) {
		service.updateUser(id, user);
		return "redirect:/user/all";
	}
	
	@PostMapping(value = "/edit")
	public String edituser(@RequestParam("id") Integer id,Model model) {
		
		Optional<User> optionalUser  = service.showById(id);
		 if (optionalUser.isPresent()) {

		        User user = optionalUser.get();


		        model.addAttribute("user", user);
		    }
		return "edit";
	}
	

}
