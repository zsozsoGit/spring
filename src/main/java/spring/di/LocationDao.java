package spring.di;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LocationDao {
    private List<String> locations = Collections.synchronizedList(new ArrayList<>());

    public findById(Long id) {
    }

    delete(long id) {
    }

    public void save(String name) {
        locations.add(name);
    }

    public List<String> findAll() {
        return new ArrayList<>(locations);

    }

    void update(long id, String name, double lat, double lon) {
    }

}
