package spring.di;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
//@Primary
@Profile("postfix")
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
