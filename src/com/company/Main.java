package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Band> bands = SystemClass.createBand();
        Administrator newAdministrator = SystemClass.createAdministrator();
        Arrangement newArrangement = SystemClass.createArrangement(bands, newAdministrator);
        newArrangement.printProgram();

    }
}
