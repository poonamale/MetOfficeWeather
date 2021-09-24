package training.metofficeweather;

import com.fasterxml.jackson.core.ObjectCodec;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
        Root siteList = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=99f12f43-b144-4279-8507-f612268f0789")
                .request(MediaType.APPLICATION_JSON)
                .get(Root.class);

        Location firstLocation = siteList.getLocations().getListOfLocations().get(0);
        ArrayList<Location> locationArray = siteList.getLocations().getListOfLocations();


        int locationID = firstLocation.getId();
        String newURL = "http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/" + locationID + "?res=3hourly&key=8fae71ad-9d25-43e0-8653-4808e2c64b89";

        //System.out.println(newURL);

        //Create instance of location class with all appropriate properties
        System.out.println();

        printBanner();

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        executeCommand(command, siteList, locationArray);

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
                    System.out.println(locationId);
                }

            }

        }
    }
}


