package spring.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;

@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;
    private DataSource myDataSource;

    @Autowired
    public EmployeeDao(DataSource myDataSource) {
        jdbcTemplate = new JdbcTemplate(myDataSource);
    }


    public long saveEmployee(String name) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
// ------------------- With lambda:
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employees(emp_name) values(?)",
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, name);
            return preparedStatement;
        }, keyHolder);
        return Objects.requireNonNull(keyHolder.getKey()).longValue();
// ------------------- WithOUT lambda:
//        jdbcTemplate.update(new PreparedStatementCreator() {
//            @Override
//            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//                PreparedStatement preparedStatement = connection.prepareStatement("insert into employees(emp_name) values(?)",
//                        Statement.RETURN_GENERATED_KEYS);
//                preparedStatement.setString(1, name);
//                return preparedStatement;
//            }
//        }, keyHolder);
//        return keyHolder.getKey().longValue();
    }

    public List<String> listEmployees() {
        return jdbcTemplate.query("select emp_name from employees order by emp_name",
                (resultSet, rowNum) -> resultSet.getString("emp_name"));
    }
}
