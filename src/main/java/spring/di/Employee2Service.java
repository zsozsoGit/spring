package spring.di;

import java.util.List;

public class Employee2Service {

    private EmployeeDao employeeDao;


    public Employee2Service(EmployeeDao employeeDao) {
        System.out.println("EmployeeDao constr");
        this.employeeDao = employeeDao;
    }

    public void saveEmployee(String name) {
        //Business Logic
        String trimmedName = name.trim();
        employeeDao.saveEmployee(trimmedName);
    }

    public List<String> listEmployees() {
        return employeeDao.listEmployees();
    }
}
