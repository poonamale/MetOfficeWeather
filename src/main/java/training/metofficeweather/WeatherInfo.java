package training.metofficeweather;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class WeatherInfo {
    private final String locationId;

    public WeatherInfo(String locationId) {
        this.locationId = locationId;
    }

    public String printLocationOneId() {
        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        Root siteList = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=99f12f43-b144-4279-8507-f612268f0789")
                .request(MediaType.APPLICATION_JSON)
                .get(Root.class);

        Location firstLocation = siteList.getLocations().getListOfLocations().get(0);
        return String.valueOf(firstLocation);
    }

    public String getLocationId() {
        return locationId;
    }
}
