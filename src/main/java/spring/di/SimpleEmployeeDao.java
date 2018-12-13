package spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@Qualifier("simple")
public class SimpleEmployeeDao implements EmployeeDao {
    private List<String> employee = Collections.synchronizedList(new ArrayList<>());


    public SimpleEmployeeDao() {

        System.out.println("employeeDao");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void saveEmployee(String name) {
        employee.add(name);
    }

    @Override
    public List<String> listEmployees() {
        return new ArrayList<>(employee);
    }
}
