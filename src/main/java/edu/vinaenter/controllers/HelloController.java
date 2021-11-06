package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String index(ModelMap map) {
		map.addAttribute("name", "Nguyen Van Dinh");
		return "hello";
	}
	
	@GetMapping("index")
	public String index() {
		return "<p style='color: blue'>Hello World!</p>";
	}

}
