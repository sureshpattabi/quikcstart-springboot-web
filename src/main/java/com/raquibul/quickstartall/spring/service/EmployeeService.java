package com.raquibul.quickstartall.spring.service;

import java.util.List;

import com.raquibul.quickstartall.spring.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

}
