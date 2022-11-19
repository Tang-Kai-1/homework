package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static String start = "";
    public static String currentStart = "";
    public static String destination = "";
    public static String route = "";
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, ArrayList<String>> allFlights;

    public static void main(String[] args) throws IOException, URISyntaxException {

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        ArrayList<String> flights = (ArrayList<String>) Files.readAllLines(path, charset);

        allFlights = getFlights(flights);
        while (!destination.equals(start) || start.equals("")) {
            System.out.println("\nCHOICES");
            System.out.println("Display all possible cities[1]");
            System.out.println("Choose destination[2]");
            System.out.print("What do you want to do:");
            String choice = sc.nextLine();
            System.out.println();
            if (choice.equals("1")) {
                printCities();
            } else if (choice.equals("2")) {
                flyToDestination();
            } else {
                System.out.println("Something went wrong. Try again.");
            }
        }
        System.out.println("Thank you for using our airline.");
        System.out.println("Your route: " + route);
    }

    public static void printCities() {
        System.out.println("Destinations: " + String.join(" | ", allFlights.keySet()));
    }

    public static void flyToDestination() {
        if (start.equals("")) {
            while (true) {
                printCities();
                System.out.println("Enter your start point:");
                start = sc.nextLine().toUpperCase();
                currentStart = start;
                route = start;
                if (allFlights.keySet().contains(start)) {
                    break;
                }
                System.out.println("Invalid start point. Try again.");
            }
        }
        while (true) {
            System.out.println("Possible destinations: " + String.join(" | ", allFlights.get(currentStart)));
            System.out.println("Enter your destination:");
            destination = sc.nextLine().toUpperCase();
            if (allFlights.get(currentStart).contains(destination)) {
                break;
            }
            System.out.println("We don't fly there. Choose another city.");
        }

        route += " -> " + destination;
        currentStart = destination;
    }

    public static HashMap<String, ArrayList<String>> getFlights(ArrayList<String> listRaw) {
        HashMap<String, ArrayList<String>> temporary = new HashMap<>();
        listRaw.removeAll(Arrays.asList("", null, " "));
        for (String flight : listRaw) {
            String[] flightSplit = flight.toUpperCase().split(" -> ");
            ArrayList<String> temp = new ArrayList<>();
            if (temporary.containsKey(flightSplit[0])) {
                temp = temporary.get(flightSplit[0]);
                temp.add(flightSplit[1]);
                temporary.put(flightSplit[0], temp);
            } else {
                temp.add(flightSplit[1]);
                temporary.put(flightSplit[0], temp);
            }
        }
        return temporary;
    }
}
