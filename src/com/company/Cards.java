package com.company;

import java.util.Random;
import java.util.Scanner;

public class Cards implements Game {
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
        int random = r.nextInt(2);

        Scanner scan = new Scanner(System.in);
        System.out.println("Da li je karta crvena (true, false)");

        boolean odg = scan.nextBoolean();
        while (odg != true && odg != false) {
            System.out.println("Molimo unesite (true, false)");
        }

//        int randomNew;
//        do {
//            randomNew = r.nextInt(2);
//        } while(randomNew == random);

        if ((random == 0 && odg == true) || (random == 1 && odg == false)) {
            System.out.println("Racunar je izabrao crvenu kartu, pogodili ste!");
            pogodak++;
        } else {
            System.out.println("Racunar je izabrao crnu kartu, pogodili ste!");
            promasaj++;
        }

    }
}
