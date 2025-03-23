package com.lms.lms_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin extends User {

    @Column(nullable = false, unique = true)
    private String adminCode;

    public Admin() {}

    public Admin(Long id, String name, String email, String password, String adminCode) {
        super(id, name, email, password);
        this.adminCode = adminCode;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }
}
