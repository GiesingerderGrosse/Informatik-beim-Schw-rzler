package at.sma.e.g.basics;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class ControlStructurs3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Kontostand = 0;

        System.out.println("Bitte wählen Sie eines der vier Möglichkeiten aus:");
        System.out.println("1. Einzahlen");
        System.out.println("2. Auszahlen");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        int Auswahl = Integer.parseInt(scanner.next());

        switch(Auswahl){

            case 1:{
                System.out.println("Bitte geben Sie den Betrag ein, den Sie einzahlen möchten:");
                int Eingabe = Integer.parseInt(scanner.next());
                Kontostand = Eingabe + Kontostand;
                break;
            }
            case 2:{
                System.out.println("Bitte geben Sie den Betrag ein, den Sie auszahlen möchten:");
                int Ausgabe = Integer.parseInt(scanner.next());

                if (Ausgabe < Kontostand){
                    System.out.println("Sie besitzen nicht genügend Geld!");
                    System.out.println("Kontostand:");
                    System.out.println(Kontostand);
                }else{
                    Kontostand = Kontostand - Ausgabe;
                }
            break;
            } case 3:{
                System.out.println("Ihr aktueller Kontostand beträgt:");
                System.out.println(Kontostand);
                break;
            } case 4:{
                break;
            } default:{
                System.out.println("Falsche Eingabe.");
            }


        }
    }
}