package com.raquibul.quickstartall.spring.model;

import com.raquibul.quickstartall.spring.dao.EmployeeDaoImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeDaoImpl employee = new EmployeeDaoImpl();
		System.out.println(employee.getAllEmployees().size());
	}
}
