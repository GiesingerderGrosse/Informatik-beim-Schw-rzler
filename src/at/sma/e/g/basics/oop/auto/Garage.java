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
}
