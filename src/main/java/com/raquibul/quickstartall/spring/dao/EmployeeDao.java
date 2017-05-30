package com.raquibul.quickstartall.spring.dao;

import java.util.List;

import com.raquibul.quickstartall.spring.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);

}
