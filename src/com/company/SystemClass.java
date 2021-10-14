package com.company;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemClass {

    private static int inputInteger() {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int userInput = 0;
        while (loop) {
            try {
                userInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number.");
            }
            if (userInput < 0) {
                System.out.println("Input must be higher than zero");
            } else {
                loop = false;
            }
        }
        return userInput;
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static ArrayList<Band> createBand() {
        int numberOfBands = numberOfBands();
        String bandName = null;
        String scheduledTime = null;
        int bandPrice = 0;
        ArrayList<Band> bands = new ArrayList<Band>();

        for (int i = 0; i < numberOfBands; i++) {
            bandName = inputBandName();
            scheduledTime = scheduledTime();
            bandPrice = bandPrice();
            bands.add(new Band(bandName, scheduledTime, bandPrice));
        }

        return bands;
    }

    public static Arrangement createArrangement(ArrayList<Band> arrayList, Administrator administrator) {
        String address = inputAddress();
        int ticketsAvailable = ticketsAvailable();

        return new Arrangement(address, ticketsAvailable, administrator, arrayList);

    }

    private static String inputBandName() {
        System.out.print("Enter the name of the band: \n>");
        return inputString();

    }

    private static int bandPrice() {
        System.out.print("Enter the agreed price: \n>");
        return inputInteger();
    }

    private static String inputAddress() {
        System.out.print("Enter the address: \n>");
        return inputString();
    }

    private static String scheduledTime() {
        System.out.print("Enter concert time: hh.mm\n>");
        return inputString();
    }

    public static int numberOfBands() {

        System.out.print("Enter number of bands for this event\n>");
        return inputInteger();
    }

    private static int ticketsAvailable() {

        System.out.print("Enter the amount of available tickets for this concert\n>");

        return inputInteger();
    }

    public static Administrator createAdministrator() {
        boolean loop = true;
        int phoneNumber = 0;
        System.out.println("Enter the administrator's details: ");
        System.out.print("Enter email: \n");
        String email = inputString();
        System.out.println("Enter phone number");


        while (loop) {

            phoneNumber = inputInteger();
            String phoneNumberString = String.valueOf(phoneNumber);
            if (phoneNumberString.length() < 8) {
                System.out.println("Number must contain 8 digits. Try again");
            } else {
                loop = false;
            }
        }
        return new Administrator(email, phoneNumber);
    }

}
