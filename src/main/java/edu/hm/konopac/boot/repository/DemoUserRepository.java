package edu.hm.konopac.boot.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import edu.hm.konopac.boot.entity.User;

@Repository
public class DemoUserRepository implements UserRepository {

	private final Map<String, User> users;
	
	public DemoUserRepository() {
		this.users = new HashMap<>();
		
		// insert users
		this.users.put("philipp", new User("philipp", "123"));
		this.users.put("jasmin", new User("jasmin", "456"));
	}
	
	@Override
	public Optional<User> findByUsername(String username) {
		return Optional.of(getUsers().get(username));
	}
	
	private Map<String, User> getUsers() {
		return users;
	}
}
