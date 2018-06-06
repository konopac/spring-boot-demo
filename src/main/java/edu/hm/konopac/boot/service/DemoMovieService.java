package edu.hm.konopac.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hm.konopac.boot.entity.Movie;
import edu.hm.konopac.boot.repository.MovieRepository;

@Service
public class DemoMovieService implements MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> findAll() {
		return movieRepository.findAll().orElse(new ArrayList<Movie>());
	}

	@Override
	public Movie findById(Long id) {
		return movieRepository.findById(id).orElse(null);
	}

}
