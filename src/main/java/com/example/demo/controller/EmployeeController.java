package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired EmployeeService employeeService;
		
	@GetMapping("/employees/{id}")
	public String viewHomePageById(@PathVariable(value = "id") int userId, Model model) {	
	
			model.addAttribute("listEmployees", employeeService.getOneEmployee(userId));
			
			return "index";
		
	}
	
	// display list of employees
	@GetMapping("/employees")
	public String viewHomePage(Model model) {
		
		model.addAttribute("listEmployees", employeeService.getAllEmployees());  // "listEmployees" in index.html
		
		return "index";
		
	}
}
