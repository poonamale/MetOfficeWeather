package training.metofficeweather;

import com.fasterxml.jackson.core.ObjectCodec;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static ObjectCodec objectMapper;

    public static void main(String args[]) {
        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        Root got = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=99f12f43-b144-4279-8507-f612268f0789")
                .request(MediaType.APPLICATION_JSON)
                .get(Root.class);

//        HashMap<String, Location> getMap = new HashMap<>();


        //Create instance of location class with all appropriate properties
        System.out.println(got.locations.getMap());
    }
}	
