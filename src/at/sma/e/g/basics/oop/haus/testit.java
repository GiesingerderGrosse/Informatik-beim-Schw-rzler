package at.sma.e.g.basics.oop.haus;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class testit {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        Random r = new Random();
        Haus haus = new Haus();
        Strasse strasse = new Strasse("Littastraße 6840 Götzis",345,2);
        System.out.println("Straße: "+strasse.getsName());

        System.out.println(haus.getInfoHaus());
        haus.setiFenster(6);
        haus.setiGartenflaeche(164);
        haus.setiHausnummer(1);
        haus.setsHausfarbe("Weiß");
        System.out.println(haus.getInfoHaus());

        Haus haus2 = new Haus(1,"Weiß",6,164);
        System.out.println(haus2.getInfoHaus());

        ArrayList<Haus> aHausListe = new ArrayList<>();
        String[] aFarben = {"Weiß", "Blau","Rot","Grau"};
        for(var i = 1;i<=100; i++){
            int hNum = i;
            int fa = r.nextInt(aFarben.length-1);
            int iF = r.nextInt(10+1-5)+5;
            int iGa = r.nextInt(200+1-100)+100;

        aHausListe.add(new Haus(hNum,aFarben[fa],iF,iGa));

        }
        for(Haus a : aHausListe){

            System.out.println(a.getInfoHaus());
            a.hausnummerSuche(5);
        }




        //Suchfunktion funktioniert noch nicht
    }
}
