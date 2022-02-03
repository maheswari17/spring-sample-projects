package com.mahi.spring.getapi.service;

import java.util.ArrayList;
import java.util.List;
import com.mahi.spring.getapi.model.Employee;

public class EmployeeService {

	private List<Employee> employeeList;

	public List<Employee> getEmployeeList() {
		if (employeeList == null) {
			employeeList = new ArrayList<>();	
		}
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
}
