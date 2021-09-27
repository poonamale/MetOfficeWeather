package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;
import training.metofficeweather.Locations;

public class Root {
    @JsonProperty(value="Locations") // For ObjectMapper
    private Locations locations;

    public Locations getLocations() {
        return locations;
    }

    @Override
    public String toString() {
        return "Root={" +
                "locations=" + locations +
                '}';
    }
}
