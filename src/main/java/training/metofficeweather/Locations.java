package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Locations {
    @JsonProperty(value="Location")
    private ArrayList<Location> locations;

    public ArrayList<Location> getListOfLocations() {
        return locations;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "locations=" + locations +
                '}';
    }

    public HashMap<String, Location> getMap() {
        HashMap<String, Location> locationHashMap = new HashMap<>();
        locations.stream().forEach(location -> locationHashMap.put(location.getName(), location));
        return locationHashMap;
    }

}
