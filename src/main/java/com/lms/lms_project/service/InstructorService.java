package com.lms.lms_project.service;

import java.util.List;
import java.util.Optional;

import com.lms.lms_project.entity.Instructor;

public interface InstructorService {
	 List<Instructor> getAllInstructors();
	 Optional<Instructor> getInstructorById(Long instructorId);
	 Instructor createInstructor(Instructor instructor);
	 void deleteInstructor(Long instructorId);

}
