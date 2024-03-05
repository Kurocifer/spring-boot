package com.example.vxloyd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

	@GetMapping("/dknow")
	public String dontKnow() {
		return "I don't know what's going on :)";
	}
}
