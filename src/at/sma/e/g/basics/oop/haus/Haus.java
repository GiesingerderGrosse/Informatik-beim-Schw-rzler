package at.sma.e.g.basics.oop.haus;

public class Haus {
    private int iHausnummer;
    private String sHausfarbe;
    private int iFenster;
    private int iGartenflaeche;

    public Haus (int iHausnummer, String sHausfarbe, int iFenster, int iGartenflaeche){
        this.iHausnummer = iHausnummer;
        this.sHausfarbe = sHausfarbe;
        this.iFenster = iFenster;
        this.iGartenflaeche = iGartenflaeche;
    }

    public Haus(){
        this.iHausnummer=0;
        this.sHausfarbe="keine Angabe";
        this.iFenster=0;
        this.iGartenflaeche=0;
    }

    public int getiHausnummer() {
        return iHausnummer;
    }

    public void setiHausnummer(int iHausnummer) {
        this.iHausnummer = iHausnummer;
    }

    public String getsHausfarbe() {
        return sHausfarbe;
    }

    public void setsHausfarbe(String sHausfarbe) {
        this.sHausfarbe = sHausfarbe;
    }

    public int getiFenster() {
        return iFenster;
    }

    public void setiFenster(int iFenster) {
        this.iFenster = iFenster;
    }

    public int getiGartenflaeche() {
        return iGartenflaeche;
    }

    public void setiGartenflaeche(int iGartenflaeche) {
        this.iGartenflaeche = iGartenflaeche;
    }

    public String getInfoHaus(){
        return "Das Haus besitzt die Hausnummer " + this.getiHausnummer() +
                " mit " + this.getiFenster() +
                " Fenstern, die Hausfarbe ist " + this.getsHausfarbe() +
                " und der Garten ist " + this.getiGartenflaeche() +
                " Quadratmeter gross.";
    }
}
