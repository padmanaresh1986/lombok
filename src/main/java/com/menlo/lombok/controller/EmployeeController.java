package com.menlo.lombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.menlo.lombok.domain.Employee;
import com.menlo.lombok.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RestController
@AllArgsConstructor
@Slf4j
public class EmployeeController {
	
	EmployeeService employeeService;
	
	@GetMapping("employee/{id}")
	public Employee getEmployee(@PathVariable Long id){
		Employee employee = employeeService.getEmployee(id);
		log.info("#############   emp obj is "+ employee);
		return employee;
	}

}
