package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int digitsSum = 0;
        while (number > 0) {
            digitsSum += number % 10;
            number /= 10;
        }
        System.out.println(digitsSum);
    }
}
