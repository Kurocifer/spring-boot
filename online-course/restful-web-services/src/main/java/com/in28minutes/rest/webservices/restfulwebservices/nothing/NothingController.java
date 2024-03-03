package com.in28minutes.rest.webservices.restfulwebservices.nothing;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NothingController {

	private MessageSource messageSource;
	
	public NothingController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
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
	
	@GetMapping("/wondering-internationalized")
	public String nothingInternationalized() {
		
		Locale locale = LocaleContextHolder.getLocale();
		
		return messageSource.getMessage(
				"wonder.sanity.message", null,
				"Default Message", locale);
	}
}