package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int onesDig = number % 10;
        int tensDig = (number / 10) % 10;
        int hundredsDigit = number / 100;
        int reversedNumber = onesDig * 100 + tensDig * 10 + hundredsDigit;
        System.out.println(reversedNumber);
    }
}
