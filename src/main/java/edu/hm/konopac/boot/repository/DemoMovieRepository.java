package edu.hm.konopac.boot.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import edu.hm.konopac.boot.entity.Movie;

@Repository
public class DemoMovieRepository implements MovieRepository {

	private final Map<Long, Movie> movies;
	
	public DemoMovieRepository() {
		this.movies = new HashMap<>();
		
		// insert movies
		this.movies.put(1L, new Movie(1L, "The Lord of the Rings", "Peter Jackson"));
		this.movies.put(2L, new Movie(2L, "Harry Potter", "Chris Columbus"));
		this.movies.put(3L, new Movie(3L, "Star Wars", "George Lucas"));
	}


	@Override
	public Optional<List<Movie>> findAll() {
		return Optional.of(new ArrayList<Movie>(movies.values()));
	}

	@Override
	public Optional<Movie> findById(Long id) {
		return Optional.of(getMovies().get(id));
	}
	
	private Map<Long, Movie> getMovies() {
		return movies;
	}

}
