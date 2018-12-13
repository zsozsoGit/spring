package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private LocationDao locationDao;

    private ApplicationContext applicationContext;


    public LocationService(LocationDao locationDao, ApplicationContext applicationContext) {
        this.locationDao = locationDao;
        this.applicationContext = applicationContext;
    }

    public Location getLocationById(long id) {
        return locationDao.findById(id);

    }

    public Location createLocationTemplate() {
        return applicationContext.getBean(Location.class);
    }

    public void deleteLocation(long id) {
        locationDao.delete(id);
    }

    public List<Location> listLocations() {
        return locationDao.findAll();
    }

    public void createLocation(String name, double lat, double lon) {
        locationDao.save(name, lat, lon);
    }

    void updateLocation(long id, String name, double lat, double lon) {
        locationDao.update(id, name, lat, lon);
    }

}
