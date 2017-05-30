package com.raquibul.quickstartall.spring.model;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int empNumber;
	private String email;
	private boolean isPermanent;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	
}
