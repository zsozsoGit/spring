package spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class EmployeeDao {
    private DataSource myDataSource;

    @Autowired
    public EmployeeDao(DataSource myDataSource) {
        this.myDataSource = myDataSource;
    }


    public void saveEmployee(String name) {
        employee.add(name);
    }

    public List<String> listEmployees() {
        return new ArrayList<>(employee);
    }
}
