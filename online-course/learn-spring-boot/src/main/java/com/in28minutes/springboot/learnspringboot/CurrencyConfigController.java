package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {

	@Autowired
	private CurrencyServiceConfiguration currencyServiceconfig;
	 
	@RequestMapping("/currency-service")
	public CurrencyServiceConfiguration retrieveAllCourses() {
		return currencyServiceconfig;
	}
}
