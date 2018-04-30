package edu.hm.konopac.boot.repository;

import java.util.Optional;

import edu.hm.konopac.boot.entity.User;

public interface UserRepository {

	public Optional<User> findByUsername(String username);
	
}
