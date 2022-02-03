package com.mahi.spring.getapi.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.mahi.spring.getapi.EmployeeDao;
import com.mahi.spring.getapi.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;

	@GetMapping(path = "/", produces = "application/json")
	public EmployeeService getEmployees() {

		return employeeDao.getAllEmployees();
	}
}
