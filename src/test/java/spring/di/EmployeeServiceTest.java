package spring.di;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class EmployeeServiceTest {

    private EmployeeDao employeeDao = mock(EmployeeDao.class);

    private EmployeeService employeeService = new EmployeeService(employeeDao);

    @Test
    public void testSave() {
        employeeService.saveEmployee("    D  ");
        verify(employeeDao).saveEmployee("D");
    }
}
