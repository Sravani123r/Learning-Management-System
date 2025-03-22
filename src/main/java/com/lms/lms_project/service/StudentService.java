package com.lms.lms_project.service;

import java.util.List;
import java.util.Optional;

import com.lms.lms_project.entity.Student;

public interface StudentService {
	  List<Student> getAllStudents();
	  Optional<Student> getStudentById(Long studentId);
	  Student createStudent(Student student);
	  void deleteStudent(Long studentId);
}
