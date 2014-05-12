package com.shambhu.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * @author Shambhu
 * 
 * This is simple advice implementation will whole method(i.e public int getEmployeeId()) as pointcut
 */
@Aspect
public class SimpleLoggerAdvice {
	@Before("getEmployeeIdMethod()")
	public void firstAdvice(){
		System.out.println("********** GetId Before Advice called *********");
	}
	
	@After("getEmployeeIdMethod()")
	public void secondAdvice(){
		System.out.println("********** GetId After Advice called *********");
	}
	
	@Pointcut("execution(public int getEmployeeId())")
	public void getEmployeeIdMethod(){}
}
