package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Wx {
    @JsonProperty("Param")
    ArrayList<Param> param;

    public ArrayList<Param> getParam() {
        return param;
    }

    @Override
    public String toString() {
        return "Wx{" +
                "param=" + param +
                '}';
    }
}
