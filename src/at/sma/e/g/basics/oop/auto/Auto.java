package at.sma.e.g.basics.oop.auto;

public class Auto {
    private int ileistung;
    private String sFarbe;
    private int iAnzahlRaeders;
    private int fahrzeughoehe;
    public Auto(int ileistung, String sFarbe, int iAnzahlRaeders, int fahrzeughoehe) {
        this.ileistung = ileistung;
        this.sFarbe = sFarbe;
        this.iAnzahlRaeders = iAnzahlRaeders;
        this.fahrzeughoehe = fahrzeughoehe;
    }

    public Auto() {
        this.ileistung =0;
        this.sFarbe ="keine Angabe";
        this.iAnzahlRaeders =0;
        this.fahrzeughoehe = 0;
    }

    public int getFahrzeughoehe() {
        return fahrzeughoehe;
    }

    public void setFahrzeughoehe(int fahrzeughoehe) {
        this.fahrzeughoehe = fahrzeughoehe;
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
                " und " + this.getiAnzahlRaeders() + " Räder." +
                "Fahrzeughöhe beträgt " + this.getFahrzeughoehe();
    }
}
