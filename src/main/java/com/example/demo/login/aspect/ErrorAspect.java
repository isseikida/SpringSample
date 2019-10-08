//package com.example.demo.login.aspect;
//
//import org.aspectj.lang.annotaiton.AfterThrowing;
//import org.aspectj.lang.annotaiton.Aspect;
//import org.springframework.dao.DataAccessException;
//import org.springframework.stereotype.Component;
//
//
//
//@Aspect
//@Component
//public class ErrorAspect {
//
//	@AfterThrowing(value="execution(..))"+"&&(bean(*Controller)||bean(*Repository))",throwing="ex")
//	public void throwingNull(DataAccessException ex) {
//
//		//例外処理の内容(ログ出力)
//
//		System.out.println("================================");
//
//		System.out.println("DataAccessExceptionが発生しました。 :" + ex);
//
//		System.out.println("================================");
//
//	}
//}
//
//
//
//
////AspectJをビルドしていないため、エラーがかかる
////補足 : AspectJとのバージョン不正のため、実装後回しのため