package com.infotech.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.app.dao.EmployeeDao;
import com.infotech.app.entities.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeDao employeedao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();

		employeedao.findAll().forEach(e -> list.add(e));

		return list;
	}

	@Override
	public synchronized boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub

		List<Employee> findByEmployeeName = employeedao.findByEmployeenameAndEmployeeageAndEmployeesalaryAndEmail(employee.getEmployeename(),
				employee.getEmployeeage(), employee.getEmployeesalary(), employee.getEmail());

		if (findByEmployeeName.size() > 0) {

			return false;

		} else {

			employeedao.save(employee);

			return true;

		}
	}

	@Override
	public Employee getemployeeById(long employeeId) {
		// TODO Auto-generated method stub

		Employee employee = employeedao.findById(employeeId).get();

		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

		employeedao.save(employee);

	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub

		employeedao.delete(getemployeeById(employeeId));

	}

}
