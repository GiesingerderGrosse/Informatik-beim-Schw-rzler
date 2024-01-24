package at.sma.e.g.basics.oop.haus;
import java.util.ArrayList;
public class Strasse {
    private String sName;
    private int ilaenge;
    private int iAnzahlGehsteige;

    private ArrayList<Haus> hausListe;

    public Strasse(String sName, int ilaenge, int iAnzahlGehsteige){
        this.sName = sName;
        this.ilaenge = ilaenge;
        this.iAnzahlGehsteige = iAnzahlGehsteige;
        this.hausListe = new ArrayList<Haus>();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getIlaenge() {
        return ilaenge;
    }

    public void setIlaenge(int ilaenge) {
        this.ilaenge = ilaenge;
    }

    public int getiAnzahlGehsteige() {
        return iAnzahlGehsteige;
    }

    public void setiAnzahlGehsteige(int iAnzahlGehsteige) {
        this.iAnzahlGehsteige = iAnzahlGehsteige;
    }


}
