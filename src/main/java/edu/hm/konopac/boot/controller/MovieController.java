package edu.hm.konopac.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.hm.konopac.boot.entity.Movie;
import edu.hm.konopac.boot.service.MovieService;

@RestController
@RequestMapping("/rest/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/all")
	public List<Movie>findAll() {
		return movieService.findAll();
	}
	
	@RequestMapping("/single")
	public Movie findById(@RequestParam Long id) {
		return movieService.findById(id);
	}
}
