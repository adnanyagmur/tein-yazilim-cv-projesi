package com.teincvhavuzu.questqpp.services;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;


import com.teincvhavuzu.questqpp.entities.User;
import com.teincvhavuzu.questqpp.repos.UserRepository;

@Service
public class UserService {

	UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User saveOneuser(User newUser) {
		return userRepository.save(newUser);
	}

	public User getOneUserById(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	public User updateOneUser(Long userId, User newUser) {
		Optional<User> user = userRepository.findById(userId);
		if(user.isPresent()) {
			User foundUser = user.get();
			foundUser.setName(newUser.getName());
			foundUser.setUserName(newUser.getUserName());
			foundUser.setPassword(newUser.getPassword());
			foundUser.setSurname(newUser.getSurname());
			foundUser.setEmail(newUser.getEmail());
			foundUser.setPhone(newUser.getPhone());
			foundUser.setEducation(newUser.getEducation());
			foundUser.setSkill(newUser.getSkill());
			foundUser.setExperience(newUser.getExperience());
			userRepository.save(foundUser);
			return foundUser;
		}else
			return null;
	}

	public void deleteById(Long userId) {
		userRepository.deleteById(userId);
		
	}
	public User getOneUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public User saveOneUser(User newUser) {
		return userRepository.save(newUser);
		
	}

	}

