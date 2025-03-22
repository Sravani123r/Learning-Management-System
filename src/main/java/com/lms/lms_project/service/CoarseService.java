package com.lms.lms_project.service;

import java.util.List;
import java.util.Optional;

import com.lms.lms_project.entity.Course;

public interface CoarseService {
	List<Course> getAllCourses();
    Optional<Course> getCourseById(Long id);
    Course createCourse(Course course);
    Course updateCourse(Long id, Course updatedCourse);
    void deleteCourse(Long id);
}
