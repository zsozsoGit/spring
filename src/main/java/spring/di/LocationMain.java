package spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LocationMain {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            //LocationDao locationDao = (LocationDao) context.getBean( "locationDao");
//            LocationDao locationDao = context.getBean(LocationDao.class);
//            locationDao.saveEmployee("JJ8J");
//            System.out.println(locationDao.listEmployees());
            LocationService locationService = context.getBean(LocationService.class);
            locationService.createLocation("s", 1, 1);
            locationService.createLocation("sa", 1, 2);
            locationService.createLocation("s1", 2, 1);
            System.out.println(locationService.listLocations());
            System.out.println(locationService.getLocationById(2));
            System.out.println(locationService.getLocationById(11));
            locationService.updateLocation(2, "ha,2", 22, 11);
            System.out.println(locationService.listLocations());
            locationService.deleteLocation(0);
            System.out.println(locationService.listLocations());

        }
    }
}
