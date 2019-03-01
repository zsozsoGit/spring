package spring.di;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@PropertySource("classpath:/application.properties")
public class AppConfig {
    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource() {
        try {
            OracleDataSource dataSource = new OracleDataSource();
            return dataSource;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Cant connect");

    }
}
