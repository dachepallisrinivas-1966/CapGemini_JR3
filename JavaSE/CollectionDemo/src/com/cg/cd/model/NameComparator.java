package com.cg.cd.model;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		String firstName = o1.getName();
		String otherName = o2.getName();
		return firstName.compareTo(otherName);
	}
	
}
