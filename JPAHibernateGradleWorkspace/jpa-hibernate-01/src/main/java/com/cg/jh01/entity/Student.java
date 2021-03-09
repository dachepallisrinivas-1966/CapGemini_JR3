package com.cg.jh01.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StudentIdentity sid;
	
	@Column(name="stud_name")
	private String name;
	
	public Student() {
		/* default constructor */
	}

	public Student(StudentIdentity sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("sid=%s, name=%s", sid, name);
	}
	
}
