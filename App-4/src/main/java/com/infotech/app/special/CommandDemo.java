package com.infotech.app.special;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.infotech.app.entities.Employee;
import com.infotech.app.service.EmployeeService;

@Component
public class CommandDemo implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(CommandDemo.class);

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		addEmployee();

	}

	private void addEmployee() {

		boolean addEmployee = employeeService.addEmployee(getinstance());

		if (addEmployee) {

			LOG.info("Successfully added");

		} else {

			LOG.info("Try Again");
		}

	}

	private Employee getinstance() {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		employee.setEmployeename("akash");
		employee.setEmployeeage(25);
		employee.setEmployeesalary(23000);
		employee.setEmail("asc@gmail.com");
		return employee;
	}

}
