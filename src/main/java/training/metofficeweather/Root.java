package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;
import training.metofficeweather.Locations;

public class Root {
    @JsonProperty(value="Locations") // For ObjectMapper
    public Locations locations;

    @Override
    public String toString() {
        return "Root={" +
                "locations=" + locations +
                '}';
    }
}
