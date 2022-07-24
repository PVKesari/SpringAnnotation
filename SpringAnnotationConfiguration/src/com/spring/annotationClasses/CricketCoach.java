package com.spring.annotationClasses;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements SportsCoach {
	
	ExpertAdvice expertAdvice;

	
	
	public CricketCoach(ExpertAdvice expertAdvice) {
		super();
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getSchedule() {
		// TODO Auto-generated method stub
		return "Morning 5am and Evening 4pm";
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getAdvice();
	}

}
