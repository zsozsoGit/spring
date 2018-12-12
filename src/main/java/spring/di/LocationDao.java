package spring.di;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LocationDao {
    private List<Location> locations = Collections.synchronizedList(new ArrayList<>());

    public Location findById(Long id) {
        return locations.stream().filter(location -> id.equals(location.getId())).findFirst().orElse(null);
    }

    public void delete(long id) {
        for (Iterator<Location> iter = locations.listIterator(); iter.hasNext(); ) {
            Location a = iter.next();
            if (a.getId() == id) {
                iter.remove();
            }
        }
    }

    //OK:
    public void save(String name, double lat, double lon) {
        locations.add(new Location(name, lat, lon));
    }

    //OK:
    public List<Location> findAll() {
        return new ArrayList<>(locations);

    }

    void update(long id, String name, double lat, double lon) {
        findById(id).change(name, lat, lon);

    }

}
