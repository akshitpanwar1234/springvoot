package com.learnSpringBoot.class1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learnSpringBoot.class1.model.GameRunner;
import com.learnSpringBoot.class1.model.MarioGame;
import com.learnSpringBoot.class1.model.pacmanGame;
import com.learnSpringBoot.class1.model.superContra;

@SpringBootApplication
public class Class1Application {

	public static void main(String[] args) {
		//var game = new superContra();
		//var game = new MarioGame();
		var game = new pacmanGame();
		 var gameRUnner = new GameRunner(game);
		 gameRUnner.run();
		 
	}

}
