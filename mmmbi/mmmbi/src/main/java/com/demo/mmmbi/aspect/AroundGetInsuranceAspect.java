package com.demo.mmmbi.aspect;

import java.time.Duration;
import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class AroundGetInsuranceAspect {


		/*@Pointcut("execution(* com.demo.mmmbi.service.*(..))")
		public void exampleService() {}

		@Around("exampleService()")
		public Object profile(ProceedingJoinPoint pjp) {
			LocalDateTime start = LocalDateTime.now();
			Object task = null;
			try {
				task = pjp.proceed();
			} catch (Throwable throwable) {
				throwable.printStackTrace();
			}
			LocalDateTime end = LocalDateTime.now();
			Duration duration = Duration.between(start, end);
			System.out.println("Execution took: " + duration.toMillis() + " ms");
			return task;
		}*/
}
