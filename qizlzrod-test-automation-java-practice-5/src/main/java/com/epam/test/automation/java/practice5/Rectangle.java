package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        if (a <= 0 && b <= 0) throw new IllegalArgumentException("Incorrect a or b");
        sideA = a;
        sideB = b;
    }

    public Rectangle(double a) {
        if (a <= 0) throw new IllegalArgumentException("Incorrect a");
        sideA = a;
        sideB = 5;
    }

    public Rectangle() {
        sideA = 4;
        sideB = 3;
    }


    public double getSideA() {
        return sideA;
    }


    public double getSideB() {
        return sideB;
    }


    public double area() {
        return sideA * sideB;
    }

    public double perimeter() {
        return (sideA + sideB) * 2;
    }


    public boolean isSquare() {
        return sideA == sideB;
    }


    public void replaceSides() {
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

}
