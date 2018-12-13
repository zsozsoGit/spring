package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;

public class EmployeeHasCreatedEvent extends ApplicationEvent{
    private String name;

    public EmployeeHasCreatedEvent(Object source, String name) {
        super(source);
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
