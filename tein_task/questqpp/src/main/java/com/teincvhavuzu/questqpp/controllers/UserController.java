package com.teincvhavuzu.questqpp.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teincvhavuzu.questqpp.entities.User;
import com.teincvhavuzu.questqpp.responses.UserResponse;
import com.teincvhavuzu.questqpp.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping
	public User createUser(@RequestBody User newUser) {
		return userService.saveOneuser(newUser);
	}
	
	//@GetMapping("/{userId}")
	//public UserResponse getOneUser(@PathVariable Long userId) {
	//	return new UserResponse(userService.getOneUserById(userId));
	//}
	
	@GetMapping("/{userName}")
	public UserResponse getOneUserByUserName(@PathVariable String userName) {
		return new UserResponse(userService.getOneUserByUserName(userName));
	}
		
	
	@PutMapping("/{userId}")
	public User updateOneUser(@PathVariable Long userId, @RequestBody User newUser) {
		return userService.updateOneUser(userId, newUser);
	}
	
	@DeleteMapping("/{userId}")
	public void deleteOneUser(@PathVariable Long userId) {
		userService.deleteById(userId);
	}
	
	
}







