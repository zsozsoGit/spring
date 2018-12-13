package spring.di;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.Assert.assertEquals;
@ActiveProfiles("postfix")
public class EmployeeServiceIntegrationTest {
    @Test
    public void testSaveThanList() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeService employeeService = context.getBean(EmployeeService.class);
            employeeService.saveEmployee("Test ");
            assertEquals(List.of("Test"), employeeService.listEmployees());
        }
    }
}
