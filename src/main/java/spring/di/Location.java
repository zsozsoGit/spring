package spring.di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Location {
    private static Long counter = 0L;
    Long id;
    String name;
    double lat;
    double lon;

    public Location(String name, double lat, double lon) {
        this.id = counter++;
        this.name = name;
        this.lon = lon;
        this.lat = lat;
    }

    public Long getId() {
        return id;
    }

    public void change(String name, double lat, double lon) {
        this.name = name;
        this.lon = lon;
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                "}\n\n";
    }
}
