package com.shambhu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shambhu.service.EmployeeService;
import com.shambhu.service.ProjectService;

public class LoggingAllGetAdviceMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeService employeeService = ctx.getBean("employeeService",
				EmployeeService.class);
		
		employeeService.getEmployee().getEmployeeId();
		
		employeeService.getEmployee().setFirstName("RAM");
		}

}
