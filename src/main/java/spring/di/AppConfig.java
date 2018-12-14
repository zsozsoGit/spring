package spring.di;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@PropertySource("classpath:/application.properties")
public class AppConfig {
    @Autowired
    private Environment environment;
    @Bean
    public DataSource dataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setUrl(environment.getProperty("jdbc.url"));
        mysqlDataSource.setUser(environment.getProperty("jdbc.username"));
        mysqlDataSource.setPassword(environment.getProperty("jdbc.password"));
        return mysqlDataSource;

    }
}
