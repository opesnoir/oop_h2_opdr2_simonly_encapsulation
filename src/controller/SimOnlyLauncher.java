package controller;

import model.Verbruik;

import java.util.Scanner;

public class SimOnlyLauncher {
    public static void main(String[] args) {

        Verbruik augustusVerbruik = new Verbruik("Augustus", 4563);
        augustusVerbruik.berekenKosten();
        augustusVerbruik.toonVerbruik();

        Scanner input = new Scanner(System.in);
        Verbruik[] arrayVerbruik = new Verbruik[4];
        arrayVerbruik[0] = new Verbruik("Juli");
        arrayVerbruik[1] = new Verbruik("Augustus");
        arrayVerbruik[2] = new Verbruik("September");
        arrayVerbruik[3] = new Verbruik("Oktober");

        //Vraag de gebruiker in een for-loop voor elke maand om de verbruikte hoeveelheid data. Gebruik de getter voor maand om de maand te tonen, gebruik de setter voor hoeveelheidMb om de waardes mee te geven aan het object.
        for (int i = 0; i < arrayVerbruik.length; i++) {
            System.out.println("Geef je dataverbruik in MB per maand: ");
            System.out.printf("%s: ", arrayVerbruik[i].getMaand());
            arrayVerbruik[i].setHoeveelheidMb(input.nextInt());
        }

        //Gebruik een for-loop om voor alle vier de maanden de kosten te bereken.
        for (int i = 0; i < arrayVerbruik.length; i++) {
            arrayVerbruik[i].berekenKosten();
        }

        //Gebruik een for-loop om voor alle vier de maanden de informatie te tonen.
        System.out.printf("%-14s%5s%7s\n", "MAAND", "MB", "KOSTEN");
        for (int i = 0; i < arrayVerbruik.length; i++) {
            arrayVerbruik[i].toonVerbruik();
        }




    }



}
