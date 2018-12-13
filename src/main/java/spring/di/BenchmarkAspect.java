package spring.di;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BenchmarkAspect {
    @Around("execution (* spring.di.EmployeeService.*(..))")
    public Object doBenchmark(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();

        Object ret = pjp.proceed();

        long end = System.currentTimeMillis();

        System.out.println("Method: " + pjp.getSignature().getName() + "Runtime: " + (end - start));
        return ret;
    }
}
