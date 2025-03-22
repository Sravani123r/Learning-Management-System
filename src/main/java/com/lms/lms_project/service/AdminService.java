package com.lms.lms_project.service;

import java.util.List;
import java.util.Optional;

import com.lms.lms_project.entity.Admin;

public interface AdminService {
	 List<Admin> getAllAdmins();
	 Optional<Admin> getAdminById(Long AdminId);
	 Admin createAdmin(Admin admin);
	 void deleteAdmin(Long AdminId);

}
