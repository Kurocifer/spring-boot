package com.in28minutes.rest.webservices.restfulwebservices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 0;
	static {
		users.add(new User(++userCount, "Ken", LocalDate.now().minusYears(15)));
		users.add(new User(++userCount, "Hit", LocalDate.now().minusYears(18)));
		users.add(new User(++userCount, "Buzz", LocalDate.now().minusYears(40)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id) {
		 Predicate<? super User> predicate = user -> user.getId() == id;
		 return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public void deleteById(int id) {
		 Predicate<? super User> predicate = user -> user.getId() == id;
		 users.removeIf(predicate);
	}
}
