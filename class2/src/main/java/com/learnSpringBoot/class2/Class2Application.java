package com.learnSpringBoot.class2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Class2Application {

	public static void main(String[] args) {
		var context  = new AnnotationConfigApplicationContext(helloWorld.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));

	}

}
