package com.teincvhavuzu.questqpp.services;

import org.springframework.stereotype.Service;

import com.teincvhavuzu.questqpp.entities.Admin;

import com.teincvhavuzu.questqpp.repos.AdminRepository;

@Service
public class AdminService {

	AdminRepository adminRepository;
	
	
	public AdminService(AdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}
	public Admin getOneAdminByAdminName(String adminName) {
		return adminRepository.findByAdminName(adminName);
	}

	
}
