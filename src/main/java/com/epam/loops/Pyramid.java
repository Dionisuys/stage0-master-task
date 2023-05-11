package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            for (int x = 1; x <= cathetusLength; x++) {
                for (int y = 1; y <= cathetusLength - x; y++) {
                    System.out.print(" ");
                }
                for (int y = x; y >= 1; y--) {
                    System.out.print(y);
                }
                for (int y = 2; y <= x; y++) {
                    System.out.print(y);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
