package edu.hm.konopac.boot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.hm.konopac.boot.entity.Movie;

public interface MovieCrudRepository extends CrudRepository<Movie, Long> {

	// This method will be implemented by Spring on the fly
	List<Movie> findByTitle(String title);
	
}
