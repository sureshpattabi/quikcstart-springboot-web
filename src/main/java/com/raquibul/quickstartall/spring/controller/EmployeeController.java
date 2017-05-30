package com.raquibul.quickstartall.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.raquibul.quickstartall.spring.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ModelAndView get() {
		return new ModelAndView("employees" , "employeesForm", employeeService.getAllEmployees());
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView addEmployee() {
		
		return new ModelAndView("employees" , "employeesForm", employeeService.getAllEmployees());
	}
}
