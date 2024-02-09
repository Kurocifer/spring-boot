package com.in28minutes.rest.webservices.restfulwebservices.steponmoon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StepOnMoon {

	@RequestMapping(method = RequestMethod.GET, path = "/step-on-moon")
	public String stepOnMoon() {
		return "A little but great step";
	}
}
