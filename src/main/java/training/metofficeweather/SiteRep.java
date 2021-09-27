package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteRep {
    @JsonProperty(value="DV") // For ObjectMapper
    public DV DV;

    public DV DV() {
        return DV;
    }

    @Override
    public String toString() {
        return "SiteRep{" +
                "DV=" + DV +
                '}';
    }
}
