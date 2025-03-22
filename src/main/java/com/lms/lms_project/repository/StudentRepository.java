package com.lms.lms_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.lms_project.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
