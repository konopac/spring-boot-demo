package edu.hm.konopac.boot.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

// @Entity // enable, if spring data is active
public class User implements UserDetails {
	private static final long serialVersionUID = -3967564712617940623L;

	// @Id // enable, if spring data is active
	// @GeneratedValue(strategy=GenerationType.AUTO) // enable, if spring data is active
	private Long id;
	private String username;
	private String password;
	
	public User() {
		
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}
	
	
}
