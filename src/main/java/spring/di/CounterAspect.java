package spring.di;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Aspect
public class CounterAspect {
    private AtomicInteger count = new AtomicInteger();

    @Before("execution (* spring.di.EmployeeService.*(..))")
    public void inc() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

    public void reset() {
        count.set(0);
    }
}
