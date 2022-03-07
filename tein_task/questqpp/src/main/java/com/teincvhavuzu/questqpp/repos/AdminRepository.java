package com.teincvhavuzu.questqpp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teincvhavuzu.questqpp.entities.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	Admin findByAdminName(String adminName);

}
