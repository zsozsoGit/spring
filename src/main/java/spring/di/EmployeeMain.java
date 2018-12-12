package spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
    public  static  void main (String[] args){
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            //EmployeeDao employeeDao = (EmployeeDao) context.getBean( "employeeDao");
//            EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
//            employeeDao.saveEmployee("JJ8J");
//            System.out.println(employeeDao.listEmployees());
            EmployeeService employeeService = context.getBean(EmployeeService.class);
            employeeService.saveEmployee("  What name           d  ");
            System.out.println(employeeService.listEmployees());

        }
    }
}
