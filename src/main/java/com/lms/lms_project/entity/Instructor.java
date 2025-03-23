package com.lms.lms_project.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "instructors")
public class Instructor extends User {

    @Column(nullable = false)
    private String department;

    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
    private List<Course> courses;

    public Instructor() {}

    public Instructor(Long id, String name, String email, String password, String department) {
        super(id, name, email, password);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
