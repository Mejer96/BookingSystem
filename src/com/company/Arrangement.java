package com.company;

import java.util.ArrayList;

public class Arrangement {
    
    String address;
    int ticketsAvailable;
    Administrator administrator;
    ArrayList<Band> arraylistOfHiredBands;

    Arrangement(String address, int ticketsAvailable, Administrator administrator, ArrayList<Band> arraylistOfHiredBands) {
        this.address = address;
        this.ticketsAvailable = ticketsAvailable;
        this.administrator = administrator;
        this.arraylistOfHiredBands = arraylistOfHiredBands;
    }

    public void changeScheduledTime() {
        System.out.print("Enter the name of the band you would like to reschedule: \n>");
        String bandToReschedule = SystemClass.inputString();
        System.out.println("Enter new time for concert: mm.hh");
        String newSchedule = SystemClass.inputString();

        arraylistOfHiredBands.get(0).scheduledTo = newSchedule;
    }

    public void printProgram() {
        System.out.println("Program:");
        for (int i = 0; i < arraylistOfHiredBands.size(); i++) {
            System.out.println(arraylistOfHiredBands.get(i).toString());
        }
    }
    public void availableTickets() {
        System.out.println(ticketsAvailable);
    }



}
