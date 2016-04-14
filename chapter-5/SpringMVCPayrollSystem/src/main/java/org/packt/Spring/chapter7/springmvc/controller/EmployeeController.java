package org.packt.Spring.chapter7.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping(method = RequestMethod.GET)
	public String welcomeEmployee(ModelMap model) {

		model.addAttribute("name", "Hello World!");
		model.addAttribute("greetings",
				"Welcome to Packt Publishing - Spring MVC !!!");
		return "hello";
	}
}
