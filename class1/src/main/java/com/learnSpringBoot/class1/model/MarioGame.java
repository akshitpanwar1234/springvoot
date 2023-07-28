package com.learnSpringBoot.class1.model;

public class MarioGame implements gamingConsole{
        public void up(){
            System.out.println("Mario jumps");
        }
        public void down(){
            System.out.println("Mario goes down");

        }
        public void right(){
            System.out.println("mario runs forwards");
        }
        public void left(){
            System.out.println("mario runs backward");
        }
}
