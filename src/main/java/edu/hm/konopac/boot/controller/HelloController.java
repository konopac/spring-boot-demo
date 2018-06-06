package edu.hm.konopac.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/rest/hello")
@RestController
public class HelloController {

	@RequestMapping("/world")
	public String hello() {
		return "Hello World!";
	}
	
}
