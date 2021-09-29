package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Period {
    public String type;
    public String value;
    @JsonProperty("Rep")
    public ArrayList<Rep> rep;

    public String getType() {
        return type;
    }

    public String getValue() {

        //Date formatter

        return value;
    }

    public ArrayList<Rep> getRep() {
        return rep;
    }

    @Override
    public String toString() {
        return "Period{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", rep=" + rep +
                '}';
    }
}
