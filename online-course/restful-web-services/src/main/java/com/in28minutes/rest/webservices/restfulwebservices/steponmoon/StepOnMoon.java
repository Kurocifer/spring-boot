package com.in28minutes.rest.webservices.restfulwebservices.steponmoon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StepOnMoon {

	@GetMapping(path = "/stepOn-moon")
	public String stepOnMoon() {
		return "A little but great step";
	}
	
	@GetMapping(path = "/stepOn-moon-bean")
	public StepOnMoonBean stepOnMoonBean() {
		return new StepOnMoonBean("A little but great step");
	}
	
	@GetMapping(path = "/stepOn-moon/path-variable/{name}")
	public StepOnMoonBean stepOnMoonPathVariable(@PathVariable String name) {
		return new StepOnMoonBean("A little but great step for " + name);
	}
}
