package com.menlo.lombok.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.menlo.lombok.domain.Employee;

@Service
public class EmployeeService {
	
	public static List<Employee> empList = new ArrayList<>();

	public Employee getEmployee(Long id){
		return empList.stream().filter(Objects::nonNull)
				.filter(emp -> emp.getId().equals(id)).findFirst().orElse(Employee.builder().build());
	}
	
}
