package com.raquibul.quickstartall.spring.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.raquibul.quickstartall.spring.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	static {
		Employee emp1 = new Employee();
		emp1.setName("Emp 1");
		emp1.setEmpNumber(1);
		emp1.setEmail("emp1@test.com");
		emp1.setPermanent(true);
		employees.put(1, emp1);
		//employees.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setName("Emp 2");
		emp2.setEmpNumber(2);
		emp2.setEmail("emp2@test.com");
		emp2.setPermanent(true);
		employees.put(2, emp2);
		//employees.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setName("Emp 3");
		emp3.setEmpNumber(3);
		emp3.setEmail("empa3@test.com");
		emp3.setPermanent(false);
		//employees.add(emp3);
		employees.put(3, emp3);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<Employee>(employees.values());
	}
	
	@Override
	public Employee getEmployeeById(int id) {
		return employees.get(id);
	}
}
