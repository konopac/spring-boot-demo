package edu.hm.konopac.boot.repository;

import java.util.List;

import edu.hm.konopac.boot.entity.Movie;

public interface MovieCrudRepository 
	// extends CrudRepository<Movie, Long> // enable, if spring data is active
	{

	// This method will be implemented by Spring on the fly
	List<Movie> findByTitle(String title);
	
}
