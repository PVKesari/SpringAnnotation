package com.spring.annotationClasses;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvice implements ExpertAdvice {

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return "Practice Atleast 3 hrs per day. Never give up,  You can do it";
	}

}
