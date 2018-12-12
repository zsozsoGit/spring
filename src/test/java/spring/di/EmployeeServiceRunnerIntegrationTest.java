package spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class EmployeeServiceRunnerIntegrationTest {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private Employee2Service employee2Service;

    @Test
    public void testSaveList() {
        employeeService.saveEmployee("    DDD ");
        assertEquals(List.of("DDD"), employeeService.listEmployees());
        employee2Service.saveEmployee("    aaa ");
        assertEquals(List.of("aaa"), employee2Service.listEmployees());
    }
}
