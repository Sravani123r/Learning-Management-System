//package com.lms.lms_project.serviceImple;
//
//import java.util.List;
//import java.util.Optional;
//
//import com.lms.lms_project.entity.User;
//import com.lms.lms_project.repository.UserRepository;
//import com.lms.lms_project.service.UserService;
//
//public class UserServiceImpl implements UserService {
//
//	private UserRepository userRepository;
//
//	@Override
//	public User createUser(User user) {
//		return userRepository.save(user);
//	}
//
//	@Override
//	public Optional<User> getUserById(Long userId) {
//        return userRepository.findById(userId);
//
//	}
//
//	@Override
//	public List<User> getAllUsers() {
//		return userRepository.findAll();
//	}
//
//	@Override
//	public User updateUser(Long id, User user) {
//		return null;
//	}
//
//	@Override
//	public void deleteUser(Long userId) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//}
