package com.cg.sbwrcd.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.sbwrcd.entity.Department;
import com.cg.sbwrcd.entity.Employee;
import com.cg.sbwrcd.exception.EmployeeException;

public interface IEmployeeService {

	Employee add(Employee emp) throws EmployeeException;
	Employee save(Employee emp) throws EmployeeException;
	void deleteById(Long empId);
	
	Employee findById(Long empId);
	Employee findByMobileNumber(String mobileNumber);
	Employee findByEmail(String email);
	
	List<Employee> findAll();
	List<Employee> findAllByDept(Department dept);
	List<Employee> findAllByJoinDate(LocalDate joinDate);
	List<Employee> findAllByBasicRange(double lb, double ub);
	
}
