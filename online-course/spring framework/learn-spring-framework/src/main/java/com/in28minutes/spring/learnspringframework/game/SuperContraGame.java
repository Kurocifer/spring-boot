package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
	
	public void up() {
		System.out.println("superContraGame up");
	}
	
	public void down() {
		System.out.println("SuperContraGame down");
	}
	
	public void left() {
		System.out.println("SuperContraGame left");
	}
	
	public void right() {
		System.out.println("SuperContraGame  right");
	}

}
