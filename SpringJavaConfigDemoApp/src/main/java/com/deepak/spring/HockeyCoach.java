package com.deepak.spring;

import org.springframework.stereotype.Component;

@Component("hockeyCoach")
public class HockeyCoach implements Coach {

	public void coaching() {
		System.out.println("Coaching Hockey");

	}

}
