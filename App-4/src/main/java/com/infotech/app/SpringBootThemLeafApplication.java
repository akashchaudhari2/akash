package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.infotech.app.service.EmployeeService;

@SpringBootApplication
@ComponentScan(basePackageClasses = EmployeeService.class)
@ComponentScan(basePackages = "com.infotech.app.special")
public class SpringBootThemLeafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThemLeafApplication.class, args);
	}
}
