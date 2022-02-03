package com.mahi.spring.getapi;

import com.mahi.spring.getapi.service.EmployeeService;
import com.mahi.spring.getapi.model.Employee;

public class EmployeeDao {
	private static EmployeeService list = new EmployeeService();
	static {
		list.getEmployeeList().add(new Employee(1, "Vikash", "Kumar", "abc@gmail.com"));
		list.getEmployeeList().add(new Employee(2, "Ritesh", "Ojha", "asdjf@gmail.com"));
		list.getEmployeeList().add(new Employee(3, "suresh", "venki", "venki@gmail.com"));

	}

	public EmployeeService getAllEmployees() {

		return list;
	}

	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);

	}
}
