package com.deepak.spring;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	public void coaching() {
		System.out.println("coaching Tennis");

	}

}
