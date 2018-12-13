package spring.di;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/application-context.xml")
@ActiveProfiles("postfix")
public class EmployeeServiceXmlIntTest {
    @Autowired
    private EmployeeService employeeService;
    @Test

    public void dummy() {
        employeeService.saveEmployee("Tes  ");
        assertEquals(employeeService.listEmployees(), List.of("Tes"));

    }
}
