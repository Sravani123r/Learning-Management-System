package com.lms.lms_project.entity;

public class Admin extends User{
	
	private String adminCode; 
	
	public Admin(Long id, String name, String email, String password ,String adminCode) {
		super(id, name, email, password);
		this.adminCode=adminCode;
	}

	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}

}
