package com.cts.service;

public class GreetServiceEnhancedImpl implements GreetService {
private String greeting;
	public String greet(String userName) {
		
		return greeting+" "+userName;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	

}
