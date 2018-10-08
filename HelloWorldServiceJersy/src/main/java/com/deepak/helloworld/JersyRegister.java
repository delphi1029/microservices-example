package com.deepak.helloworld;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JersyRegister extends ResourceConfig{

	public JersyRegister() {
		register(HelloWorldServiceJersy.class);
	}
}
