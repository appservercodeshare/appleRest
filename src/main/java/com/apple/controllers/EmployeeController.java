package com.apple.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.apple.controllers.commands.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/addEmployee", method=RequestMethod.POST, 
		consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody public void add(@RequestBody Employee employee) {
		System.out.println(employee);
	}
	
}
