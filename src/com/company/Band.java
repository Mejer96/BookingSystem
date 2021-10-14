package com.company;

public class Band {

    int price;
    String scheduledTo;
    String bandName;

    Band(String bandName, String scheduledTo, int price) {
        this.price = price;
        this.scheduledTo = scheduledTo;
        this.bandName = bandName;
    }

    public String toString() {
        return bandName + " scheduled to kl. " + scheduledTo + " Price: " + price;
    }

}


