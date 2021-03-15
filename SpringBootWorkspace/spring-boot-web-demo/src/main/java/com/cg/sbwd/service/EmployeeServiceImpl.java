package com.cg.sbwd.service;

import org.springframework.stereotype.Service;

import com.cg.sbwd.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public Employee computeAllowances(Employee e) {
		e.setHra(e.getBasic()*0.8);
		e.setTa(e.getBasic()*0.13);
		return e;
	}

}
