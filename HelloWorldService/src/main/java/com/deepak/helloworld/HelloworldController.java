package com.deepak.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloworldController {
	
	
	//GET
	//path
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "Hello Wotld";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Wotld");
	}
	
	
 
}
