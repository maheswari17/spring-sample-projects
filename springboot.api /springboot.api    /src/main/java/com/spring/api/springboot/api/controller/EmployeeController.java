package com.spring.api.springboot.api.controller;

import com.spring.api.springboot.api.exception.ResourceNotFoundException;
import com.spring.api.springboot.api.model.Employee;
import com.spring.api.springboot.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/employ")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
@GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
    return  employeeRepository.save(employee);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
    Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("employee not exist with id:"+id));
    return ResponseEntity.ok(employee);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee employeeDetails){
    Employee updateEmployee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("employee doesnt exist with id"+id));

    updateEmployee.setId(employeeDetails.getId());
    updateEmployee.setFirstName(employeeDetails.getFirstName());
    updateEmployee.setLastName(employeeDetails.getLastName());
    updateEmployee.setEmail(employeeDetails.getEmail());

    employeeRepository.save(updateEmployee);

    return ResponseEntity.ok(updateEmployee);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
    Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("resouce not found with id:"+id));
        employeeRepository.delete(employee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
