package com.deepak.restful.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static int userCount = 3;
	
	static {
		users.add(new User(1,"AA",new Date()));
		users.add(new User(2,"BB",new Date()));
		users.add(new User(3,"CC",new Date()));
	}
	
	
	public List<User> findAll() {
		return users;
	}
	
	public void save(User user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
	}
	
	public User getUser(int id) {
		
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
