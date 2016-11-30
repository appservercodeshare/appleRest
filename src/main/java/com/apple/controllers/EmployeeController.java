package com.apple.controllers;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.apple.controllers.commands.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void add(@RequestBody Employee employee) {
		System.out.println("Employee Added:" + employee);
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void updateEmployee(@RequestBody Employee employee) {
		System.out.println("Employee Updated:" + employee);
	}

	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.POST, consumes = MediaType.TEXT_HTML_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void deleteEmployee(@PathVariable("id") Integer employeeId) {
		System.out.println("Employee Deleted:" + employeeId);
	}
	
	@RequestMapping(value = "/getEmployeeById/{id}", method = RequestMethod.POST, consumes = MediaType.TEXT_HTML_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Employee getEmployeeById(@PathVariable("id") Integer employeeId) {
		Employee employee = new Employee();
		employee.setFirstName("Farhan");
		employee.setLastName("Quazi");
		Set<String> skills = new HashSet<String>();
		skills.add("Java");
		skills.add("J2EE");
		employee.setSkills(skills);
		return employee;
	}
	
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Collection<Employee> getAllEmployees() {
		Collection<Employee> employees = new HashSet<Employee>();
		
		Employee employee = new Employee();
		employee.setFirstName("Farhan");
		employee.setLastName("Quazi");
		Set<String> skills = new HashSet<String>();
		skills.add("Java");
		skills.add("J2EE");
		employee.setSkills(skills);
		employees.add(employee);
		
		employee = new Employee();
		employee.setFirstName("Guddu");
		employee.setLastName("Ali");
		skills = new HashSet<String>();
		skills.add("Java");
		skills.add("J2EE");
		skills.add("Hibernate");
		skills.add("Spring");
		skills.add("JDBC");
		skills.add("Oracle");
		skills.add("MySQL");
		employee.setSkills(skills);
		employees.add(employee);
		return employees;
	}

}
