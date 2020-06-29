package com.menlo.lombok;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.menlo.lombok.domain.Employee;
import com.menlo.lombok.service.EmployeeService;

@SpringBootApplication
public class LombokApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		EmployeeService.empList.add(new Employee(1L, "Padma", "Naresh", new Date(), "12345"));
		EmployeeService.empList.add(new Employee(2L, "Punya", "M", new Date(), "78965"));
		EmployeeService.empList.add(Employee.builder().id(3L).firstName("Srinivas").dob(new Date()).build());
		
	}

}
