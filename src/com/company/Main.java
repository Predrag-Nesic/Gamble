package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        AppTest a = new AppTest();
//        Class c1 =  AppTest.class;
//
//        for(Field f : c1.getFields()) {
//            System.out.println(f.getName());
//        }
//
//        for(Method f : c1.getMethods()) {
//            System.out.println(f.getName());
//        }

        System.out.println("Unesite ime igre koju zelite");
        Scanner scan = new Scanner(System.in);
        String igra = scan.nextLine();

        try {
            Class game_class = Class.forName("com.company." + igra);
            Object game_class_object = game_class.newInstance();
            System.out.println("Unesite broj pokusaja");
            int pokusaj = Integer.parseInt(scan.nextLine());
            for(int i = 0; i < pokusaj; i++) {
                ((Gamble)game_class_object).pick();
            }

            System.out.println("Broj pogodaka: "  +((Gamble)game_class_object).getPogodak() +
                    "\nBroj promasaja: " + ((Gamble)game_class_object).getPromasaj());

        } catch(ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
