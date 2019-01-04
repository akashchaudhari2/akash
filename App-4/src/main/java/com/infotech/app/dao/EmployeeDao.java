package com.infotech.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.app.entities.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long>{

	public List<Employee> findByEmployeenameAndEmployeeageAndEmployeesalaryAndEmail(String employeename,int employeeage,double employeesalary,String email);
	
	
}
