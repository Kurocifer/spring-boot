package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.yaml.snakeyaml.extensions.compactnotation.PackageCompactConstructor;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
			= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		//MarioGame game = new MarioGame();
		//SuperContraGame game1 = new SuperContraGame();
		
		//GameRunner runner = new GameRunner(game);
		//GameRunner runner1 = new GameRunner(game1);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.run();
		
	}
}
