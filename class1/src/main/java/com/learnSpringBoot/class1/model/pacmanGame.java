package com.learnSpringBoot.class1.model;

public class pacmanGame implements gamingConsole{
    
    public void up(){
        System.out.println("goes up");
    }
    public void down(){
        System.out.println(" goes down");

    }
    public void right(){
        System.out.println(" runs right");
    }
    public void left(){
        System.out.println(" runs left");
    }
}
