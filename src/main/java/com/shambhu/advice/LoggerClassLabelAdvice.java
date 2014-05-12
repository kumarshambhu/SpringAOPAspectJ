package com.shambhu.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * @author Shambhu
 * 
 *
 */
@Aspect
public class LoggerClassLabelAdvice {

	@Before("allSecificModelgetMethod()")
	public void firstAdvice() {
		System.out.println("**********  Before Advice called *********");
	}

	@After("allSecificModelgetMethod()")
	public void secondAdvice() {
		System.out.println("**********  After Advice called *********");
	}
	
	//Package level
	@Pointcut("execution(public * com.shambhu.model.*.get*())")
	public void allModelgetMethod() {
	}
	
	@Pointcut("execution(public * com.shambhu.model.Employee.get*())")
	public void allSecificModelgetMethod() {
	}

}
