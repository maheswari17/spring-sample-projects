package com.spring.api.springboot.api;

import com.spring.api.springboot.api.model.Employee;
import com.spring.api.springboot.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setId(6);
		employee.setFirstName("balu");
		employee.setLastName("krishna");
		employee.setEmail("balu@gmail.com");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee.setId(7);
		employee.setFirstName("abhi");
		employee.setLastName("ram");
		employee.setEmail("abhi@gmail.com");
		employeeRepository.save(employee);

		Employee employee2=new Employee();
		employee.setFirstName("chai");
		employee.setLastName("sai");
		employee.setEmail("chai@gmail.com");
		employeeRepository.save(employee);
	}
}
