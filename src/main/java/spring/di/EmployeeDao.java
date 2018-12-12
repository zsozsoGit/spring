package spring.di;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDao {
    private List<String> employee = Collections.synchronizedList(new ArrayList<>());

    public  void saveEmployee(String name)
    {
        employee.add(name);
    }

    public List<String>listEmployees()
    {
        return new ArrayList<>(employee);
    }
}
