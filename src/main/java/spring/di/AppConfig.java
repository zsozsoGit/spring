package spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@PropertySource("classpath:/application.properites")
public class AppConfig {
    @Autowired
    private Environment environment;
    @Bean
    public String applicationVersion() {
        String version = environment.getProperty("application.version");
        System.out.println("Version: "+ version);
        System.out.println("OS: " + environment.getProperty("OS"));
        return  version;
    }
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
