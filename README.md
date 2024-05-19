# oop_les2_opdracht2_simonly_encapsulation
onderwerpen behandeld:
encapsulation
constanten
constructor chaining
array van objecten

en ook:
uitlijnen van tekst
in de launcher:
        //Gebruik een for-loop om voor alle vier de maanden de informatie te tonen.
        System.out.printf("%-14s%5s%7s\n", "MAAND", "MB", "KOSTEN");
        for (int i = 0; i < arrayVerbruik.length; i++) {
            arrayVerbruik[i].toonVerbruik();
        }
in de model:
public void toonVerbruik() {
System.out.printf("%-14s%5d%7.2f %s\n", maand, hoeveelheidMb, kosten, (kosten > BASIS_KOSTEN) ? "buiten je bundel!" : "");
}

door data heen loopen:
//Vraag de gebruiker in een for-loop voor elke maand om de verbruikte hoeveelheid data. Gebruik de getter voor maand om de maand te tonen, gebruik de setter voor hoeveelheidMb om de waardes mee te geven aan het object.
for (int i = 0; i < arrayVerbruik.length; i++) {
System.out.println("Geef je dataverbruik in MB per maand: ");
System.out.printf("%s: ", arrayVerbruik[i].getMaand());
arrayVerbruik[i].setHoeveelheidMb(input.nextInt());
}