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
public class LoggerAllAdvice {


	@Before("allMethod()")
	public void firstAdvice() {
		System.out.println("**********  Before Advice called *********");
	}

	@After("allMethod()")
	public void secondAdvice() {
		System.out.println("**********  After Advice called *********");
	}
	
	@Pointcut("execution(public * *())")
	public void allMethod() {
	}
	
	


}
