package com.shambhu.advice;

import org.aspectj.lang.JoinPoint;
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
public class AdviceWithJointPoint {



	@Before("allMethod()")
	public void firstAdvice(JoinPoint joinPoint) {
		System.out.println("**********  Before Advice called *********"+joinPoint.toShortString());
	}

	@After("allMethod()")
	public void secondAdvice(JoinPoint joinPoint) {
		System.out.println("**********  After Advice called *********"+joinPoint.toLongString());
	}
	
	@Pointcut("execution(public * *())")
	public void allMethod() {
	}
	
	



}
