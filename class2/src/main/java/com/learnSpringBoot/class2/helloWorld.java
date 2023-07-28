package com.learnSpringBoot.class2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name , int age){};
record Address(String state , String City){};
@Configuration
public class helloWorld {


    @Bean
    public String name(){
        return "Akshit";
    }
    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public String State(){
        return "UP";
    }
    @Bean
    public String City(){
        return "Muzaffarnagar";
    }


    @Bean
    public Person person(){
        return new Person("Akshita",17);
    }
    @Bean(name = "person2")
    public Person person2(){
        return new Person("Akku",19);
    }

    @Bean
    public Address address(String State, String City){
        return new Address(State, City);
    }




}
