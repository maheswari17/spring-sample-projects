package com.spring.api.springboot.api.repository;

import com.spring.api.springboot.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
