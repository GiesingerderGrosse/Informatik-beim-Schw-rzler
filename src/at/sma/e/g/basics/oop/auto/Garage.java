package at.sma.e.g.basics.oop.auto;

import java.util.ArrayList;

public class Garage {
    private int stellplaetze;
    private String adresse;
    private int einfahrtshoehe;
    private double preisstunde;

    private ArrayList<Auto> autoListe;

    public Garage(int stellplaetze, String addresse, int einfahrtshoehe, double preisstunde) {
        this.stellplaetze = stellplaetze;
        this.adresse = addresse;
        this.einfahrtshoehe = einfahrtshoehe;
        this.preisstunde = preisstunde;
        this.autoListe = new ArrayList<Auto>();
    }

    public int getStellplaetze() {
        return stellplaetze;
    }

    public void setStellplaetze(int stellplaetze) {
        this.stellplaetze = stellplaetze;
    }

    public String getAddresse() {
        return adresse;
    }

    public void setAddresse(String addresse) {
        this.adresse = addresse;
    }

    public int getEinfahrtshoehe() {
        return einfahrtshoehe;
    }

    public void setEinfahrtshoehe(int einfahrtshoehe) {
        this.einfahrtshoehe = einfahrtshoehe;
    }

    public double getPreisstunde() {
        return preisstunde;
    }

    public void setPreisstunde(double preisstunde) {
        this.preisstunde = preisstunde;
    }

    public int getAutosinGarage(){
        return this.autoListe.size();
    }

    public int getFreiePlaetze(){
        return this.stellplaetze - getAutosinGarage();
    }

    public void addAutoGarage(Auto auto){
        //Abfrage ist Auto hoeher als garagehoehe
        if(auto.getFahrzeughoehe()> this.einfahrtshoehe) {
            System.out.println("Hoi, hast a hohes Auto, leider nid i dera Garage!!!!! Maxhoehe in der Garage: "+this.einfahrtshoehe);
        }else if (this.getFreiePlaetze() > 0) {
            this.autoListe.add(auto);
        }else{
            System.out.println("Upps, Garage keinen Platz mehr frei, versuche es später nocheinmal!!!!");
        }

    }

    public int getGesamtFahrzeugeUebereinander(){
        int wert = 0;
        for (Auto a : autoListe) {
            wert += a.getFahrzeughoehe();
        }
        return wert;
    }

    public void getAutoFarbe(String farbe) {
        System.out.println("Folgende Auto mit Farbe " + farbe + " sind in der Liste:");
        for (Auto a : autoListe){
            if (a.getsFarbe().equals(farbe)){
                System.out.println(a.getInfoAuto());
            }
        }
    }

    public void getAutoLeistung(int lmin, int lmax){
        if(lmin>lmax){
            int ch = lmax;
            lmin = lmax;
            lmax = ch;
        }
        System.out.println("Folgende Auto mit Leistung von " + lmin + " bis max " + lmax + " sind in der Liste:");
        for(Auto a : autoListe){
            if(a.getIleistung()>lmin && a.getIleistung() < lmax){
                System.out.println(a.getInfoAuto());
            }
        }
    }


    public void loescheAutosFarbe(String farbe) {
        //aus der Liste entfernen
        int counter =0;
        for (int i = autoListe.size() - 1; i >= 0; i--) {
            if(autoListe.get(i).getsFarbe().equals(farbe)) {
                autoListe.remove(i);
                counter++;
            }
        }
        System.out.println("Es wurden " + counter + " " + farbe + " Autos gelöscht.");
    }
}
    //Wir suchen nach Autos mit Farbe x
    //Suche Autos mit Leistung von, bis