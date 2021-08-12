package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

// import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Id
	private long id;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees(){
	
		return employeeRepository.findAll();
		
	}
	

	@Override
	public Optional<Employee> getOneEmployee(long id){
	
		return Optional.ofNullable(employeeRepository.getById(id));
	}
	
}
