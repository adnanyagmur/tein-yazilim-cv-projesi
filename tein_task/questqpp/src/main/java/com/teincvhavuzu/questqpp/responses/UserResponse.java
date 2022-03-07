package com.teincvhavuzu.questqpp.responses;

import com.teincvhavuzu.questqpp.entities.User;

import lombok.Data;
@Data
public class UserResponse {

	Long id;
	String userName;
	String name;
	String phone;
	String education;
	String experience;
	String skill;
	String surname;
	String email;


	public UserResponse(User entity) {
		this.id = entity.getId();
		this.userName = entity.getUserName();
		this.surname = entity.getSurname();
		this.email = entity.getEmail();
		this.name = entity.getName();
		this.phone = entity.getPhone();
		this.education = entity.getEducation();
		this.skill= entity.getSkill();
		this.experience = entity.getSkill();
	} 
}

	

