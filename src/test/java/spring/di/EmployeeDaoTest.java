package spring.di;

import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
//@Sql(scripts = "classpath:/clear.sql")
public class EmployeeDaoTest {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private Flyway flyway;

    @Before
    public void init() {
        flyway.clean();
        flyway.migrate();
    }

    @Test
    public void testSaveThanList() {
        employeeDao.saveEmployee("15HUHU ");

        assertEquals(List.of("1HUHU "), employeeDao.listEmployees());
    }
}
