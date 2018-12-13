package spring.di;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
public class PostfixEmployeeDao implements EmployeeDao {
    private List<String> employee = Collections.synchronizedList(new ArrayList<>());

    @Override
    public void saveEmployee(String name) {
        employee.add(name + " (" + name.length() + ")");
    }

    @Override
    public List<String> listEmployees() {
        return new ArrayList<>(employee);
    }
}
