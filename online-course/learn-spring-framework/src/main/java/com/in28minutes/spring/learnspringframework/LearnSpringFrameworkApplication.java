package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		/*
		MarioGame game0 = new MarioGame();
		SuperContraGame game1 = new SuperContraGame();
		PacmanGame game2 = new PacmanGame();
		
		GameRunner runner0 = new GameRunner(game0);
		GameRunner runner1 = new GameRunner(game1);
		GameRunner runner2 = new GameRunner(game2);
		*/
		
		runner.run ();
		//runner1.run();
		//runner2.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		
		System.out.println(controller.returnValueFromBuisinessService());
	}

}
