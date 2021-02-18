package com.cg.iosd.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private transient String ATMPassword;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("Name = ");
		output.append(name);
		if (email != null) {
			output.append("Email = ");
			output.append(email);
		}
		return output.toString();
	}
}
