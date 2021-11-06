package edu.vinaenter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class IndexController {

	@GetMapping("index")
	public String sayHello() {
		return "<p style='color: blue'>Hello World!</p>";
	}
}
