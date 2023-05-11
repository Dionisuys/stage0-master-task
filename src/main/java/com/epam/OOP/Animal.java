package com.epam.OOP;

public class Animal {
    private String color = "";
    private int numberOfPaws = 0;
    private boolean hasFur = true;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String result = "";
        String pow = numberOfPaws > 1 ? " paws" : " paw";
        String fur = hasFur ? pow + " and a fur." : pow + " and no fur.";
        result = "This animal is mostly " + color + ". It has " + numberOfPaws +
                fur;
        return result;
    }
}
