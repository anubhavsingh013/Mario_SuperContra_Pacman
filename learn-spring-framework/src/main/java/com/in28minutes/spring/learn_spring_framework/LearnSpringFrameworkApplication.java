package com.in28minutes.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learn_spring_framework.game.GameRunner;
import com.in28minutes.spring.learn_spring_framework.game.MarioGame;
import com.in28minutes.spring.learn_spring_framework.game.PacManGame;
import com.in28minutes.spring.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		// SuperContraGame game=new SuperContraGame();
		// PacManGame game=new PacManGame();
		// MarioGame game=new MarioGame();
		// GameRunner runner=new GameRunner(game);

		// Getting a specific bean
		GameRunner runner=context.getBean(GameRunner.class);
		// when spring manages the creaation of object and creates instances of them we call it as bean
		runner.run();
	}

}
