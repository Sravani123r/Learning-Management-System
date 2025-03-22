package com.lms.lms_project.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;

public interface UserService {
	User createUser(User user);
	
	Optional<User> getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
