package com.teincvhavuzu.questqpp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teincvhavuzu.questqpp.entities.Admin;

import com.teincvhavuzu.questqpp.requests.AdminRequest;
import com.teincvhavuzu.questqpp.responses.AdminResponse;
import com.teincvhavuzu.questqpp.services.AdminService;



@RestController
@RequestMapping("/admin")
public class AdminController {

	

	
	private AdminService adminService;
	

	public AdminController(AdminService adminService) {
		this.adminService = adminService;
}

	@PostMapping("/login")
	public AdminResponse login(@RequestBody AdminRequest loginRequest) {
		Admin admin = adminService.getOneAdminByAdminName(loginRequest.getAdminName());
		AdminResponse adminResponse = new AdminResponse();
		adminResponse.setMessage("Mesaj");
		adminResponse.setAdminId(admin.getId());
		return adminResponse;
}


}
