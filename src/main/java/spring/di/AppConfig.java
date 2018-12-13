package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@EnableAspectJAutoProxy
public class AppConfig {

//    @Bean
//    public EmployeeDao employeeDao(){
//        System.out.println("empolyeedao");
//        return new EmployeeDao();
//    }
//
//    @Bean
//    public EmployeeService employeeService() {
//        return new EmployeeService(employeeDao());
//    }
}
