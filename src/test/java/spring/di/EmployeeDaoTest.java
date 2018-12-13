package spring.di;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeDaoTest {
    private EmployeeDao employeeDao = new SimpleEmployeeDao();

    @Test
    public void testSaveThanList() {
        employeeDao.saveEmployee("HUHU ");
        assertEquals(List.of("HUHU "), employeeDao.listEmployees());
    }
}
