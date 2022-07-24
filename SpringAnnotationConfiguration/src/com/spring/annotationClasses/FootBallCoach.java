package com.spring.annotationClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements SportsCoach {
	
	private ExpertAdvice expertAdvice;
	
	

	public ExpertAdvice getExpertAdvice() {
		return expertAdvice;
	}
	
	@Autowired
	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getSchedule() {
		
		return "Every morning 6 to 7 am and Evening 7- 8 pm";
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return getExpertAdvice().getAdvice();
	}

}
