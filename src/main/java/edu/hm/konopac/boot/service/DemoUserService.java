package edu.hm.konopac.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.hm.konopac.boot.repository.UserRepository;

@Service
public class DemoUserService implements UserService, UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User with username " + username + " not found"));
	}
}
