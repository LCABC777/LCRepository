package com.lc.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//代表新加业务功能或分工完成的功能
@Component
@Aspect
public class MyAdvice {
	@Before("execution(* com.lc.service.impl.UserServiceImpl.*(..))")
	public void myBefore(){
		//int i=1/0;
		System.out.println("前置通知");
	}
	@After("execution(* com.lc.service.impl.UserServiceImpl.*(..))")
	public void myAfter(){
		System.out.println("后置通知");
	}
	@AfterReturning("execution(* com.lc.service.impl.UserServiceImpl.*(..))")
	public void myAfterReturning(){
		System.out.println("只有切点正确执行才执行的后置通知");
	}
	@AfterThrowing("execution(* com.lc.service.impl.UserServiceImpl.*(..))")
	public void myThrowing(){
		System.out.println("出异常了");
	}
}
