package training.metofficeweather;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class WeatherController {

    @RequestMapping("/weather")
    ModelAndView home() {

        Locations displayLocations = new Locations();
        HashMap<String, Integer> locationIDHashMap = new HashMap<>();

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        Root siteList = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=99f12f43-b144-4279-8507-f612268f0789")
                .request(MediaType.APPLICATION_JSON)
                .get(Root.class);

        ArrayList<Location> locationArray = siteList.getLocations().getListOfLocations();

        for (Location eachLocation : locationArray){
            String locationName = String.valueOf(eachLocation.getName());
            Integer locationID = eachLocation.getId();
            locationIDHashMap.put(locationName,locationID);
        }
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(locationIDHashMap);

        return new ModelAndView("index" , "locationIDHashmap", treeMap);
    }

    @RequestMapping("/weatherInfo")
    ModelAndView weatherInfo(@RequestParam("locationId") String locationId) {

        String newURL = "http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/" + locationId + "?res=3hourly&key=8fae71ad-9d25-43e0-8653-4808e2c64b89";
        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        RootSiteRep weather = client.target(newURL)
                .request(MediaType.APPLICATION_JSON)
                .get(RootSiteRep.class);
        System.out.println("The temperature in "+ weather.siteRep.DV.weatherLocations.name.toLowerCase(Locale.ROOT) +" is " +weather.siteRep.DV.weatherLocations.period.get(0).rep.get(0).T +" degrees");

        return new ModelAndView("info", "weatherInfo", weather) ;
    }
}
