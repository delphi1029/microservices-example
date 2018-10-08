package com.deepak.restful.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService dao;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return dao.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		User user = dao.getUser(id);
		
		if(user == null) {
			throw new UserNotFoundException("Id - "+id);
		}
		return user;
	}
	
	@PostMapping("/users")
	public void create(@RequestBody User user) {
		dao.save(user);
	}


}
