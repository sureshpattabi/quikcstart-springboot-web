package com.raquibul.quickstartall.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raquibul.quickstartall.spring.dao.EmployeeDao;
import com.raquibul.quickstartall.spring.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}
}
