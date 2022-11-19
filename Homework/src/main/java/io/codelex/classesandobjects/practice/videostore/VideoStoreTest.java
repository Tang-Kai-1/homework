package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        VideoStore store = new VideoStore();
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to get list of movies");
            System.out.println("Choose 3 to rent video (as user)");
            System.out.println("Choose 4 to return video (as user)");


            int n = keyboard.nextInt();
            keyboard.nextLine();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard, store);
                    break;
                case 2:
                    store.printVideoInventory();
                    break;
                case 3:
                    rentVideo(keyboard, store);
                    break;
                case 4:
                    returnVideo(keyboard, store);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner, VideoStore store) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            System.out.println("Enter rating");
            double rating = scanner.nextDouble();
            scanner.nextLine();
            store.videoStoreAdd(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner, VideoStore store) {
        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();
        store.videoCheckOut(movieName);
    }

    private static void returnVideo(Scanner scanner, VideoStore store) {
        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();
        System.out.println("Enter rating for movie");
        double rating = scanner.nextDouble();
        scanner.nextLine();
        store.videoCheckIn(movieName, rating);
    }
}
