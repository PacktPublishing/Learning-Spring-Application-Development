package org.packt.Spring.chapter8.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping("/employee")
	public ModelAndView getEmployee() {
		String string = "Congrats ! We are done with first Spring Security configuration !";
		return new ModelAndView("employee", "string", string);
	}
}
