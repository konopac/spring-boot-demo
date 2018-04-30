package edu.hm.konopac.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/rest/user")
@RestController
public class UserController {

	@GetMapping("/hello")
	public String index() {
		return "Hello World!";
	}
	
}
