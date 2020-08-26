package com.jstsapp.io.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jstsapp.io.UserService;
import com.jstsapp.io.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/new")
	public User registerNew(@RequestBody User user) {
		
		return userService.createUser(user);
	}
	@GetMapping("/all")
	public List<User> getAll() {
		return userService.getAllUsers();
	}
	@PutMapping
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	@GetMapping("/{userId}")
	public User getUser(@PathVariable long userId) {
		return userService.getUser(userId);
	}
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable long userId) {
		return userService.deleteUser(userId);
	}
}
