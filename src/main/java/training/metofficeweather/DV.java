package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DV {
    public String dataDate;
    public String type;
    @JsonProperty("Location")
    WeatherLocations weatherLocations;

    public String getDataDate() {
        return dataDate;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DV{" +
                "dataDate='" + dataDate + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
