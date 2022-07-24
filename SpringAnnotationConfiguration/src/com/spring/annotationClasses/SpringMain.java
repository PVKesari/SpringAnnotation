package com.spring.annotationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("com.spring.configuration");
		
		System.out.println("------------------------------- Cricket Coach ---------------------------------");
		
		SportsCoach sp = ctx.getBean("cricketCoach", SportsCoach.class);
		sp.getAdvice();
		sp.getSchedule();
		
		System.out.println("------------------------------- Football Coach ---------------------------------");
		
		sp = ctx.getBean("footBallCoach", SportsCoach.class);
		sp.getAdvice();
		sp.getSchedule();
	}
}
