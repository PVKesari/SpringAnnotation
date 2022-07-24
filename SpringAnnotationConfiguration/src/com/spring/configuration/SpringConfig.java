package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.annotationClasses.CricketCoach;
import com.spring.annotationClasses.ExpertAdvice;
import com.spring.annotationClasses.FootBallCoach;
import com.spring.annotationClasses.PracticeAdvice;
import com.spring.annotationClasses.SportsCoach;

@Configuration
@ComponentScan("com.spring.annotationClasses")
public class SpringConfig {

	@Bean
	public ExpertAdvice practiceAdvice() {
		return new PracticeAdvice();
	}
	
	@Bean
	public SportsCoach cricketCoach() {
		return new CricketCoach(practiceAdvice());
	}
	
	@Bean 
	public SportsCoach footBallCoach() {
		return new FootBallCoach();
	}
}
