package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RootSiteRep {
    @JsonProperty(value = "SiteRep")
    public SiteRep siteRep;

    @Override
    public String toString() {
        return "Root={" +
                "SiteRep=" + siteRep +
                '}';
    }
}
