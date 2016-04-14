package org.packt.Spring.chapter7.springmvc.controller;

import java.io.IOException;

import org.packt.Spring.chapter7.springmvc.exception.GenericException;
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

	@RequestMapping("/testIOException")
	public String testIOException(ModelMap model) throws IOException {

		if (true) {
			// add custom message that appear to error page
			throw new IOException("This is an IO Exception");
		}
		return "hello";
	}

	@RequestMapping("/testGenericException")
	public String testGenericException(ModelMap model) throws IOException {

		if (true) {
			// add custom code and message that appear to error page
			throw new GenericException("R333", "This is a custom message");
		}
		return "hello";
	}
}
