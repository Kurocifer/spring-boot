package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

public class PacmanGame implements GamingConsole{
	
	public void up() {
		System.out.println("Pacman chop up");
	}
	
	public void down() {
		System.out.println("Packman chop down");
	}
	
	public void left() {
		System.out.println("Pacman chop left");
	}
	
	public void right() {
		System.out.println("Pacman chop right");
	}

}
