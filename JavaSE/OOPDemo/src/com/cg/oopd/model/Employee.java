package com.cg.oopd.model;

public class Employee extends Person {
	private double salary;
	
	public Employee() {
		super();				// calling super class default constructor
	}

	public Employee(String name, int age, double salary) {
		super(name, age);		// calling super class parameter constructor
		this.salary = salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + "Salary : " + salary;
	}
	
}
