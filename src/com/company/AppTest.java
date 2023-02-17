package com.company;

public class AppTest {
    public int count; // fields must be public in order to be seen from the getFields() method
    public String name;

    public void printIt() {
        System.out.println("printIt no param");
    }

    @Override
    public String toString() {
        return "ToString method";
    }
}
