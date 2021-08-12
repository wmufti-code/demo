package com.example.demo.services;

import java.util.List;
// import java.util.Optional;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	Optional<Employee> getOneEmployee(long id);
	
}
