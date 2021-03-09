package com.cg.jh01.entity;

import java.io.Serializable;

public class StudentIdentity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String course;
	private String branch;
	
	public StudentIdentity() {
		/* default constructor */
	}

	public StudentIdentity(String course, String branch) {
		this.course = course;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return String.format("course=%s, branch=%s", course, branch);
	}
}
