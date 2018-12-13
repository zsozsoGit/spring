package spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

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

    public static Long getCounter() {
        return counter;
    }

    public static void setCounter(Long counter) {
        Location.counter = counter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void change(String name, double lat, double lon) {
        this.name = name;
        this.lon = lon;
        this.lat = lat;
    }

//    @Override
//    public String toString() {
//        return "Location{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", lat=" + lat +
//                ", lon=" + lon +
//                "}\n\n";
//    }
}
