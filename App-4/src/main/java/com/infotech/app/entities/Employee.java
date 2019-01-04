package com.infotech.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "employeeId")
	private long employeeid;

	private String employeename;

	private int employeeage;

	private double employeesalary;

	private String email;

	public long getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getEmployeeage() {
		return employeeage;
	}

	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}

	public double getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
