package at.sma.e.g.basics.oop.auto;

public class Auto {
    private int ileistung;
    private String sFarbe;
    private int iAnzahlRaeders;

    public Auto(int ileistung, String sFarbe, int iAnzahlRaeders) {
        this.ileistung = ileistung;
        this.sFarbe = sFarbe;
        this.iAnzahlRaeders = iAnzahlRaeders;
    }

    public Auto() {
        this.ileistung =0;
        this.sFarbe ="keine Angabe";
        this.iAnzahlRaeders =0;
    }

    public int getiAnzahlRaeders() {
        return iAnzahlRaeders;
    }

    public void setiAnzahlRaeders(int iAnzahlRaeders) {
        this.iAnzahlRaeders = iAnzahlRaeders;
    }

    public int getIleistung() {
        return ileistung;
    }

    public void setIleistung(int ileistung) {
        this.ileistung = ileistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public String getInfoAuto(){
        return "Auto Farbe ist " + this.getsFarbe() +
                " mit Leistung " + this.getIleistung() +
                " und " + this.getiAnzahlRaeders() + " Räder.";
    }
}
