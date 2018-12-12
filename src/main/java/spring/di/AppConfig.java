package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public EmployeeDao employeeDao(){
        System.out.println("empolyeedao");
        return new EmployeeDao();
    }

    @Bean
    @DependsOn("initBean")
    public EmployeeService employeeService() {
        return new EmployeeService(employeeDao());
    }

    @Bean
    @DependsOn("initBean")
    public Employee2Service employee2Service() {
        return new Employee2Service(employeeDao());
    }

    @Bean
    public InitBean initBean() {
        return new InitBean();
    }
}
