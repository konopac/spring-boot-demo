package edu.hm.konopac.boot.service;

import java.util.List;

import edu.hm.konopac.boot.entity.Movie;

public interface MovieService {

	public List<Movie> findAll();
	
	public Movie findById(Long id);
	
}
