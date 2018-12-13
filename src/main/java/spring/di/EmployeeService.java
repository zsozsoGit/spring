package spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    private EmployeeDao employeeDao;



    public EmployeeService(@Simple EmployeeDao employeeDao) {
        System.out.println("EmployeeService constr with: " + employeeDao.toString());
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
