package com.lms.lms_project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student extends User {
	
	private String enrollmentId;
	
	@ManyToMany
	@JoinTable(
		name="student_course" ,
		joinColumns=@JoinColumn(name="student_id"),
		inverseJoinColumns=@JoinColumn(name="couse_id")
	)
	private List<Course> courses;

	public Student(Long id, String name, String email, String password ,String enrollmentId) {
		super(id, name, email, password);
		this.enrollmentId=enrollmentId;
	}

	public String getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(String enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

}
