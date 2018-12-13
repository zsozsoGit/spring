package spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeXmlMain {
    public static void main(String[] args) {
        try (
                ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/application-context.xml")
        ) {
//            EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
//            employeeDao.saveEmployee("ssss");
            EmployeeService employeeService = context.getBean(EmployeeService.class);
            employeeService.saveEmployee("Cicamica");
        }
    }
}
