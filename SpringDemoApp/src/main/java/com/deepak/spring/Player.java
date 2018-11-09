package com.deepak.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("player")
public class Player {
	

	private Coach coach;

	@Autowired
	public Player(@Qualifier("hockeyCoach") Coach coach) {
		super();
		this.coach = coach;
	}
	
	public void gettingCoached() {
		coach.coaching();
	}

}
