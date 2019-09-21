//package com.example.demo.login.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
////ポイント1 : @Aspect
//@Aspect
//@Component
//
//public class LogAspect {
//
//	//ポイント2 : AOP実装
//	@Before("execution(* *..*.*Controller.*(..))")
//	public void startLog(JoinPoint jp) {
//		System.out.println("メソッド開始 : " + jp.getSignature());
//	}
//
//	//ポイント2 : AOP実装
//	@After("execution(* *..*.*Controller.*(..))")
//	public void endLog(JoinPoint jp) {
//		System.out.println("メソッド終了 : " + jp.getSignature());
//	}
//}
