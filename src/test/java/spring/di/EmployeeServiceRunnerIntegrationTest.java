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
    private CounterAspect counterAspect;

    @Test
    public void testSaveList() {
        counterAspect.reset();
        employeeService.saveEmployee("    DDD ");
        employeeService.saveEmployee("    SSS ");
        employeeService.saveEmployee("    DDD ");
        employeeService.listEmployees();
        assertEquals(List.of("DDD", "SSS", "DDD"), employeeService.listEmployees());
        assertEquals(3, counterAspect.getCount());
    }
}
