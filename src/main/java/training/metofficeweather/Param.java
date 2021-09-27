package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Param {
    public String name;
    public String units;
    @JsonProperty("$")
    public String weatherDescription;

    public String getName() {
        return name;
    }

    public String getUnits() {
        return units;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    @Override
    public String toString() {
        return "Param{" +
                "name='" + name + '\'' +
                ", units='" + units + '\'' +
                ", weatherDescription='" + weatherDescription + '\'' +
                '}';
    }
}
