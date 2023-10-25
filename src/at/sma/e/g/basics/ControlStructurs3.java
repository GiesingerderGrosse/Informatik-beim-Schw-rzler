package at.sma.e.g.basics;

import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        randomNumber = randomNumber + 5;

        switch (randomNumber){
            case 10:
                System.out.println("Ten");
                break;

            case 9:
                System.out.println("Nine");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 6:
                System.out.println("Six");
                break;

            case 5:
                System.out.println("Five");
                break;

            default:
                System.out.println("other value");
                break;
        }

        // Erstelle eine Zufallszahl zwischen 5 und 10

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.

    }
}