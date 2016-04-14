package org.packt.Spring.chapter7.springmvc.controller;

import org.packt.Spring.chapter7.springmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public String welcomeEmployee(ModelMap model) {
		model.addAttribute("name", "Hello World!");
		model.addAttribute("greetings",
				"Welcome to Packt Publishing - Spring MVC !!! @Author: Ravi Kant Soni");
		return "hello";
	}

	@RequestMapping(value = "/listEmployees", method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {
		model.addAttribute("employeesList", employeeService.listEmployee());
		return "employee";
	}

}
