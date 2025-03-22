package com.lms.lms_project.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String title;
    private String description;
    
    @ManyToMany(mappedBy="courses")  
    private List<Student> students;

    @ManyToOne  
    @JoinColumn(name = "instructor_id")  
    private Instructor instructor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
