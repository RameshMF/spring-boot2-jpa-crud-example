package net.guides.springboot2.springboot2jpacrudexample.controller;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	private static final Employee EMPLOYEE = new Employee("a", "b", "c");

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return Collections.singletonList(EMPLOYEE);
	}
}
