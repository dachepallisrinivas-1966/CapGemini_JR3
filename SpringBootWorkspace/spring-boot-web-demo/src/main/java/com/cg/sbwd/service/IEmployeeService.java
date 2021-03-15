package com.cg.sbwd.service;

import com.cg.sbwd.model.Employee;

@FunctionalInterface
public interface IEmployeeService {
	Employee computeAllowances(Employee e);
}
