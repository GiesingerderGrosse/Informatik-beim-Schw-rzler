package at.sma.e.g.basics;

import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {

        Random random = new Random();
        int Summe = 0;
        boolean Stopp = false;


    while (!Stopp){

        int randomValue = random.nextInt(20);
        randomValue = randomValue + 10;

        if (randomValue == 15){
            Stopp = true;
        }else if (randomValue == 25){
            Stopp = true;
        }else{
            Summe = Summe + randomValue;
        }

    }
        System.out.println(Summe);



    }
}