package com.lms.lms_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.lms_project.entity.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	

}
