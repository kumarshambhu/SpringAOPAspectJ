package com.shambhu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shambhu.service.EmployeeService;

public class SimpleLoggerMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		//when calling employeeid method advice is printed
		employeeService.getEmployee().getEmployeeId();
		/*
		 o/p
			********** GetId Before Advice called *********
			Getting employee id method called
			********** GetId After Advice called *********
		 */
		// when calling firstname method advice is not printing
		employeeService.getEmployee().getFirstName();
		/*
		o/p
		
		 */

	}

}
