package com.infotech.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.infotech.app.entities.Employee;
import com.infotech.app.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id) {

		Employee getemployeeById = employeeService.getemployeeById(id);

		return new ResponseEntity<Employee>(getemployeeById, HttpStatus.OK);

	}

	@GetMapping("employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {

		List<Employee> allEmployees = employeeService.getAllEmployees();

		return new ResponseEntity<List<Employee>>(allEmployees, HttpStatus.OK);
	}

	@PostMapping("student")
	public ResponseEntity<Void> addEmployeeDetails(@RequestBody Employee employee, UriComponentsBuilder builder) {

		boolean addEmployee = employeeService.addEmployee(employee);

		if (addEmployee == false) {

			return new ResponseEntity<Void>(HttpStatus.CONFLICT);

		} else {

			HttpHeaders headers = new HttpHeaders();

			headers.setLocation(builder.path("/employee/{id}").buildAndExpand(employee.getEmployeeid()).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}
	}

	@PutMapping("employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {

		employeeService.updateEmployee(employee);

		return new ResponseEntity<Employee>(HttpStatus.OK);

	}
@DeleteMapping("employee/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id) {

		employeeService.deleteEmployee(id);

		return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
	}

}
