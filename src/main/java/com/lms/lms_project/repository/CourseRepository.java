package com.lms.lms_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.lms_project.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
