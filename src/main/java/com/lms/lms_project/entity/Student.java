package com.lms.lms_project.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student extends User {

    @Column(nullable = false, unique = true)
    private String enrollmentId;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    public Student() {}

    public Student(Long id, String name, String email, String password, String enrollmentId) {
        super(id, name, email, password);
        this.enrollmentId = enrollmentId;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
