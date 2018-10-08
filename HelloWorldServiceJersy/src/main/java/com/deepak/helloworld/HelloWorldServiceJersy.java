package com.deepak.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hellodeepak")
public class HelloWorldServiceJersy {
	
	@GET
	@Produces("application/json")
	public HelloWorld helloWorld() {
		return new HelloWorld("Hello Deepak");
	}
	
}
