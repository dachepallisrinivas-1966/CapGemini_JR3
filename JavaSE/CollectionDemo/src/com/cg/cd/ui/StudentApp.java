package com.cg.cd.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.cg.cd.model.NameComparator;
import com.cg.cd.model.Student;

public class StudentApp {

	public static void main(String[] args) {
		Student [] students = {
				new Student(1, "srinivas", 28),
				new Student(2, "radha", 27),
				new Student(3, "deepa", 26),
				new Student(4, "pankaj", 25),
				new Student(7, "kumar", 25),
				new Student(6, "pranav", 26),
				new Student(9, "prabhu", 27),
				new Student(8, "swapna", 27),
				new Student(10, "srinivas", 54)
		};
		
		List<Student> studentList = Arrays.asList(students);
		
		// Collections.sort(studentList);
		for(Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println("-----------------------------");
		
		Set<Student> studentSet = new TreeSet<>(studentList);
		for(Student student : studentSet) {
			System.out.println(student);
		}
		
		System.out.println("-----------------------------");
		
		Set<Student> studentSet2 = new TreeSet<>(new NameComparator());
		studentSet2.addAll(studentList);
		for(Student student : studentSet2) {
			System.out.println(student);
		}
	}

}
