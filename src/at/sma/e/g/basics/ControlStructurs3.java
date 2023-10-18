package at.sma.e.g.basics;

import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5);

        switch (randomNumber){
            case 0:
                System.out.println("is 0");
                break;

            case 1:
                System.out.println("is 1");
                break;

            case 2:
                System.out.println("is 2");
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