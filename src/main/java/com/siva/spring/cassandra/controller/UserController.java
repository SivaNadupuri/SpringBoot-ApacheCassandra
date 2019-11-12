/**
 * 
 */
package com.siva.spring.cassandra.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.siva.spring.cassandra.model.User;
import com.siva.spring.cassandra.repository.UserRepository;

/**
 * @author Siva
 *
 */

@RestController
public class UserController {

	@Autowired

	private UserRepository userRepository;

	@PostConstruct
	public void saveUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(643, "SIva", "Golagam", 25));
		users.add(new User(644, "Virat", "Golagam", 25));
		users.add(new User(647, "SIva", "Golagam", 25));
		users.add(new User(648, "SIva", "Golagam", 25));
		userRepository.saveAll(users);

	}

	@GetMapping("/allUsers")
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@GetMapping("/allUser/{age}")
	public List<User> getAllUserFilterByAge(@PathVariable int age) {
		return userRepository.findByAgeGreaterThan(age);
	}

}
