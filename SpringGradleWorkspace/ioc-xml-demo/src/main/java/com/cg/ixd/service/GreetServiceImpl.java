package com.cg.ixd.service;

public class GreetServiceImpl implements IGreetService {

	public String getGreeting(String userName) {
		return "Hello "+userName;
	}
	
}
