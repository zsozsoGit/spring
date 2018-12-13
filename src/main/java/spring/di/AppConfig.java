package spring.di;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

//    @Bean
//    @Scope("prototype")
//    public EmployeeDao employeeDao() {
//        System.out.println("empolyeedao");
//        return new EmployeeDao();
//    }
//
//    @Bean
//    @DependsOn("initBean")
//    public EmployeeService employeeService() {
//        return new EmployeeService(employeeDao());
//    }
//
//    @Bean
//    @DependsOn("initBean")
//    public Employee2Service employee2Service() {
//        return new Employee2Service(employeeDao());
//    }
//
//    @Bean
//    public InitBean initBean() {
//        return new InitBean();
//    }
}
