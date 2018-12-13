package spring.di;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class LoggerService implements ApplicationListener<EmployeeHasCreatedEvent> {
    @Override
    public void onApplicationEvent(EmployeeHasCreatedEvent employeeHasCreatedEvent) {
        String name = employeeHasCreatedEvent.getName();
        System.out.println("E: " +name);
    }
}
