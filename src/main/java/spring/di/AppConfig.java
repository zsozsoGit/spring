package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

//    @Bean
//    public LocationDao locationDao() {
//        System.out.println("LocDao");
//        return new LocationDao();
//    }
//
//
//
//    @Bean
//    public Location templateLocation() {
//        return new Location("Choose name",47.05,19.05);
//    }
//
//    @Bean
//    public LocationService locationService() {
//        return new LocationService(locationDao());
//    }
}
