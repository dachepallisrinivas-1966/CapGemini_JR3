package com.cg.oopd.ui;

import com.cg.oopd.model.ContractEmployee;
import com.cg.oopd.model.Employee;
import com.cg.oopd.model.Manager;

public class InheritanceApp {

	public static void main(String[] args) {
		// Person person = new Person("srinivas", 54);
		// System.out.println(person);
		
		Employee employee = new Employee("vamsy", 35, 56000);
		System.out.println(employee);
		
		Manager manager = new Manager("divya", 46, 78000, 15000);
		System.out.println(manager);
		
		ContractEmployee contractEmployee = new ContractEmployee("suman", 21, 15000, 60);
		System.out.println(contractEmployee);

	}

}
