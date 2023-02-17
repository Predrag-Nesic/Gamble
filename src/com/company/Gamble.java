package com.company;

import java.util.Random;
import java.util.Scanner;

public class Gamble implements Game {
    private static int pogodak, promasaj;

    public int getPogodak() {
        return pogodak;
    }

    public int getPromasaj() {
        return promasaj;
    }

    @Override
    public void pick() {
        Random r = new Random();
        int random = r.nextInt(5) + 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Da li je broj manji (true, false)");

        boolean odg = scan.nextBoolean();
        while(odg != true && odg != false) {
            System.out.println("Molimo unesite (true, false)");
        }

        int randomNew;
        do {
            randomNew = r.nextInt(5) + 1;
        } while(randomNew == random);

        if((randomNew < random && odg == true) || (randomNew > random && odg == false)) {
            System.out.println("Racunar je izabrao " + random + ", novi broj je " + randomNew + ", pogodili ste!");
            pogodak++;
        } else {
            System.out.println("Racunar je izabrao " + random + ", novi broj je " + randomNew + ", niste pogodili!");
            promasaj++;
        }


    }
}
