package spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        try (
                Connection conn = myDataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("insert into employees(emp_name) values (?)")
        ) {
            ps.setString(1, name);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public List<String> listEmployees() {
        try (
                Connection conn = myDataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select emp_name from employees");
                ResultSet rs = ps.executeQuery()
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);

            }
            return names;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
