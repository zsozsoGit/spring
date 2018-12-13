package spring.di;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class EmployeeDao {
    private List<String> employee = Collections.synchronizedList(new ArrayList<>());


    public EmployeeDao() {

        System.out.println("employeeDao");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public void saveEmployee(String name) {
        employee.add(name);
    }

    public List<String> listEmployees() {
        return new ArrayList<>(employee);
    }
}
