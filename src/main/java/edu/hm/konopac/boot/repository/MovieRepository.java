package edu.hm.konopac.boot.repository;

import java.util.List;
import java.util.Optional;

import edu.hm.konopac.boot.entity.Movie;

public interface MovieRepository {

	public Optional<List<Movie>> findAll();
	
	public Optional<Movie> findById(Long id);
	
}
