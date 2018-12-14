package spring.di;

import org.flywaydb.core.Flyway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
//@Sql(scripts = "classpath:/clear.sql")
public class EmployeeDaoTest {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private Flyway flyway;

    @Autowired
    private EmployeeRepository employeeRepository;

    //    @Before
//    public void init() {
//        flyway.clean();
//        flyway.migrate();
//    }
    @Test
    public void findByNameOwnTest() {
        List<Employee> resit = employeeRepository.findByNameIgnoreCase("1huhu");
        System.out.println(resit);
        assertEquals(1, resit.size());

    }

    @Test
    public void findByNameLenTest() {
        employeeRepository.save(new Employee("123huhu"));
        List<Employee> resit = employeeRepository.findByMyThing(7);
        System.out.println(resit.get(0).getName());
        assertEquals(7, resit.get(0).getName().length());

    }

    @Test
    public void testSaveThanList() {
        employeeDao.saveEmployee("1HUHU ");

        assertEquals(List.of("1HUHU "), employeeDao.listEmployees());
    }

    @Test
    public void testPaging() {
        for (int i = 0; i < 100; i++) {
            String nam = "t" + i;
            employeeRepository.save(new Employee(nam));
        }

        Page<Employee> page = employeeRepository.findAll(PageRequest.of(2, 11, Sort.by("name")));
        System.out.println(page.getTotalElements());


    }


}
