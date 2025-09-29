package com.tnsif.ifet.day3.example;

public class Car {
	String brand;
    int year;
    public Car(String b, int y) {
        brand = b;
        year = y;
    }
    public void showInfo() {
        System.out.println("Car: " + brand + " (" + year + ")");
    }

}
