package org.packt.Spring.chapter8.springsecurity.controller;

import org.packt.Spring.chapter8.springsecurity.model.Employee;
import org.packt.Spring.chapter8.springsecurity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/listemployee", method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {
		model.addAttribute("employeesList", employeeService.listEmployee());
		return "employee";
	}

	@RequestMapping(value = "/addemployee", method = RequestMethod.GET)
	public ModelAndView addEmployee(ModelMap model) {
		return new ModelAndView("addemployee", "command", new Employee());
	}

	@RequestMapping(value = "/updatemployee", method = RequestMethod.POST)
	public String updateEmployee(
			@ModelAttribute("employeeForm") Employee employee, ModelMap model) {
		this.employeeService.insertEmployee(employee);
		model.addAttribute("employeesList", employeeService.listEmployee());
		return "employee";
	}

	@RequestMapping(value = "/delete/{empId}", method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable("empId") Integer empId,
			ModelMap model) {
		this.employeeService.deleteEmployee(empId);
		model.addAttribute("employeesList", employeeService.listEmployee());
		return "employee";
	}
}
