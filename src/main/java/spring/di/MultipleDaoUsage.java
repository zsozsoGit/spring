package spring.di;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MultipleDaoUsage {


    private List<EmployeeDao> employeeDaos;

    public MultipleDaoUsage(List<EmployeeDao> employeeDaos) {
        this.employeeDaos = employeeDaos;
        System.out.println(employeeDaos);
    }

    public  void saveEmployeeDaos(String name)
    {
        for (EmployeeDao employeeDao: employeeDaos){
            System.out.printf("Save to "+ employeeDao);
            employeeDao.saveEmployee(name);
        }
    }

    public List<String> listEmployees()
    {
        List<String> names = new ArrayList<>();
        for (EmployeeDao employeeDao: employeeDaos){
            System.out.printf("Get "+ employeeDao);
            names.addAll(employeeDao.listEmployees());
        }
        return names;
    }
}
