package com.deepak.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.deepak.spring.Player;
import com.deepak.spring.config.CoachAppConfig;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CoachAppConfig.class);
		Player p = context.getBean(Player.class,"player");
		p.gettingCoached();
	}

}
