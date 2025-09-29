package com.tnsif.ifet.day3.example;

public class Main {
	public static void main(String[] args) {

        Car car1 = new Car("Tesla", 2023);
        Car car2 = new Car("Toyota", 2020);
        Car car3 = new Car("Honda", 2018);
        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }

}
