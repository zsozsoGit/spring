package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LocationDao locationDao() {
        System.out.println("LocDao");
        return new LocationDao();
    }

    @Bean
    public LocationService locationService() {
        return new LocationService(locationDao());
    }
}
