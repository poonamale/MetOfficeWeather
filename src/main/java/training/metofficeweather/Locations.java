package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Locations {
    @JsonProperty(value="Location")
    ArrayList<Location> locations;

    @Override
    public String toString() {
        return "Locations{" +
                "locations=" + locations +
                '}';
    }
}
