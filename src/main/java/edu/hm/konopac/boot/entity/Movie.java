package edu.hm.konopac.boot.entity;

// @Entity // enable, if spring data is active
public class Movie {
	
	// @Id // enable, if spring data is active
	// @GeneratedValue(strategy=GenerationType.AUTO) // enable, if spring data is active
	private Long id;
	private String title;
	private String director;
	
	public Movie() {
		
	}
	
	public Movie(Long id, String title, String director) {
		this.id = id;
		this.title = title;
		this.director = director;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
