package com.cg.jh01.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.jh01.model.Address;

@Entity
@Table(name="employees2")
public class Employee2 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="emp_id")
	private Long empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column
	private Double salary;
	
	@Column(name="doj")
	private LocalDate dateJoined;
	
	@Embedded
	private Address address;
	
	
	public Employee2() {
		/* no implementation for default constructor */
	}

	public Employee2(Long empId, String empName, Double salary, LocalDate dateJoined, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dateJoined = dateJoined;
		this.address = address;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, empName=%s, salary=%s, dateJoined=%s, address=%s", empId, empName,
				salary, dateJoined, address);
	}
}
