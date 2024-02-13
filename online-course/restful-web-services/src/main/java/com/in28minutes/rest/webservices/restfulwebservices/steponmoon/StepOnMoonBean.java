package com.in28minutes.rest.webservices.restfulwebservices.steponmoon;

public class StepOnMoonBean {

	private String message;
	
	public StepOnMoonBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("StepOnMoonBean [message=%s]", message);
	}
	
	
	
}
