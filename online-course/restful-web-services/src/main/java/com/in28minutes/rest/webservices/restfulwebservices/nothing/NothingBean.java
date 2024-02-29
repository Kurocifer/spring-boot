package com.in28minutes.rest.webservices.restfulwebservices.nothing;

public class NothingBean {

	private String message;

	public NothingBean(String message) {
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
		return "Nothing [message=" + message + "]";
	}

}
