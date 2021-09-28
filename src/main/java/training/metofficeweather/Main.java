package training.metofficeweather;

import com.fasterxml.jackson.core.ObjectCodec;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        Root siteList = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=99f12f43-b144-4279-8507-f612268f0789")
                .request(MediaType.APPLICATION_JSON)
                .get(Root.class);

        Location firstLocation = siteList.getLocations().getListOfLocations().get(0);
        ArrayList<Location> locationArray = siteList.getLocations().getListOfLocations();

        printBanner();

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        executeCommand(command, siteList, locationArray);
        int locationID = firstLocation.getId();



    }
    private static void printBanner() {
        System.out.println("Welcome to the Weather App");
        System.out.println();
        System.out.println("Please enter your request:");
        System.out.println(" List All - list all locations");
        System.out.println(" List [Account] - weather data for specified location");
        System.out.println(" Quit application");
        System.out.println();
    }


    public static void executeCommand(String command, Root siteList, ArrayList<Location> locations) {
        if (command.equalsIgnoreCase("quit")) {
            System.out.println("Goodbye.");
            System.exit(0);
        }
        if (command.equalsIgnoreCase("all")) {
            System.out.println(siteList.getLocations().getMap().keySet());
        }
        else {
            for (Location eachLocation : locations) {
                String locationName = String.valueOf(eachLocation.getName());
                if (command.equalsIgnoreCase(locationName)) {
                    String locationId = String.valueOf(eachLocation.getId());
                    String newURL = "http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/" + locationId + "?res=3hourly&key=8fae71ad-9d25-43e0-8653-4808e2c64b89";
                    Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
                    RootSiteRep weather = client.target(newURL)
                            .request(MediaType.APPLICATION_JSON)
                            .get(RootSiteRep.class);
                    System.out.println(locationId);
                    System.out.println("The temperature in "+ weather.siteRep.DV.weatherLocations.name.toLowerCase(Locale.ROOT) +" is " +weather.siteRep.DV.weatherLocations.period.get(0).rep.get(0).T +" degrees");


                }

            }

        }
    }
}


