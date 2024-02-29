package com.in28minutes.rest.webservices.restfulwebservices.nothing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NothingController {

	@GetMapping("/nothing")
	public String nothing() {
		return "Nothing but Nothing";
	}
	
	@GetMapping("/nothing-bean")
	public NothingBean nothingBean() {
		return new NothingBean("Still nothing yet");
	}
	
	@GetMapping("/nothing/{name}")
	public NothingBean NothingPathVariable(@PathVariable String name) {
		return new NothingBean(String.format(
				"You are nothing but nothing, %s", name));
	} 
}