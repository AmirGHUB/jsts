package com.jstsapp.io;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jstsapp.io.models.User;
import com.jstsapp.io.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User updateUser(User user) {
		User usr = userRepository.findById(user.getId()).orElse(new User());
		if(usr !=null) {
			
		}
		return userRepository.save(user);
	}

	public User getUser(long userId) {
		return userRepository.findById(userId).orElse(new User());
	}
	public String deleteUser(long userId) {
		userRepository.deleteById(userId);
		return  "User with Id"+ userId +" has been deleted";
	}
	
}
