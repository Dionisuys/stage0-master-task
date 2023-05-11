package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int abs = 1;
        for (int i = 1; i <= power; i++) {
            abs *= numberToPrint;
        }
        System.out.println(abs);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
