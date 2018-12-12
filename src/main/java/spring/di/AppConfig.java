package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LocationDao employeeDao() {
        System.out.println("empolyeedao");
        return new LocationDao();
    }

    @Bean
    public LocationService employeeService() {
        return new LocationService(employeeDao());
    }
}
