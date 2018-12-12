package spring.di;

import java.util.List;

public class LocationService {

    private LocationDao locationDao;


    public LocationService(LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    getLocationById(long id) {
    }

    deleteLocation(long id) {
    }

    public void saveEmployee(String name) {
        //Business Logic
        String trimmedName = name.trim();
        locationDao.saveEmployee(trimmedName);
    }

    public List<String> listLocations() {
        return locationDao.findAll();
    }

    void createLocation(String name, double lat, double lon) {
    }

    void updateLocation(long id, String name, double lat, double lon) {
    }

}
