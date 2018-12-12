package spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LocationMain {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            //LocationDao employeeDao = (LocationDao) context.getBean( "employeeDao");
//            LocationDao employeeDao = context.getBean(LocationDao.class);
//            employeeDao.saveEmployee("JJ8J");
//            System.out.println(employeeDao.listEmployees());
            LocationService locationService = context.getBean(LocationService.class);
            locationService.saveEmployee("  What name           d  ");
            System.out.println(locationService.listEmployees());

        }
    }
}
