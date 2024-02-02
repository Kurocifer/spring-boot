package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.extensions.compactnotation.PackageCompactConstructor;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;
import com.in28minutes.spring.learnspringframework.game.PacmanGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame mario = new MarioGame();
		SuperContraGame game2 = new SuperContraGame();
		PacmanGame pacman = new PacmanGame();
		
		GameRunner runner = new GameRunner(mario);
		GameRunner runner2 = new GameRunner(game2);
		GameRunner runner3 = new GameRunner(pacman);
		
		runner.run();
		runner2.run();
		runner3.run();
		
	}
}
