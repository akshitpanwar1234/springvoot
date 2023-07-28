package com.learnSpringBoot.class1.model;

public class GameRunner {

    private gamingConsole game;


    public GameRunner(gamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game is Running: "+ game );
        game.up();
        game.down();
        game.right();
        game.left();
    }
    
}
