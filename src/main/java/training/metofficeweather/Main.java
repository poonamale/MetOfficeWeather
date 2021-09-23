package training.metofficeweather;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class Main {
    public static void main(String args[]) {
        Client client = ClientBuilder.newClient();
        String name = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/324387?res=3hourly&key=8fae71ad-9d25-43e0-8653-4808e2c64b89")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
        System.out.println(name);
    }
}	
