package com.infotech.app.service;

import java.util.List;

import com.infotech.app.entities.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployees();
	boolean addEmployee(Employee employee);
	Employee getemployeeById(long employeeId);
	void updateEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	
	
	
}
