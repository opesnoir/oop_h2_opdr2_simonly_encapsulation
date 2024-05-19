package model;

public class Verbruik {
    //attributen
    private final static double BASIS_KOSTEN = 9.95;
    private final int VERBRUIK_ABONNEMENT = 3000;
    private final double MEERPRIJS_MB = 0.025;
    private String maand;
    private int hoeveelheidMb;
    private double kosten;

    //constructors
    public Verbruik(String maand, int hoeveelheidMb) {
        this.maand = maand;
        this.hoeveelheidMb = hoeveelheidMb;
    }

    public Verbruik(String maand) {
        this(maand, 0);
    }

    public Verbruik() {
        this("onbekend");
    }

    //getters, setters
    public String getMaand() {
        return maand;
    }

    public void setHoeveelheidMb(int hoeveelheidMb) {
        this.hoeveelheidMb = hoeveelheidMb;
    }

    //methoden
    public void berekenKosten() {
        if (hoeveelheidMb <= VERBRUIK_ABONNEMENT) {
            kosten = BASIS_KOSTEN;
        } else {
            int verbruikBuitenBundel = hoeveelheidMb - VERBRUIK_ABONNEMENT;
            double kostenBuitenBundel = MEERPRIJS_MB * verbruikBuitenBundel;
            kosten = BASIS_KOSTEN + kostenBuitenBundel;
        }
    }

    public void toonVerbruik() {
        System.out.printf("%-14s%5d%7.2f %s\n", maand, hoeveelheidMb, kosten, (kosten > BASIS_KOSTEN) ? "buiten je bundel!" : "");
    }
}
