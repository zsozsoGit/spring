package spring.di;

import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao;



    public EmployeeService(EmployeeDao employeeDao) {
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
