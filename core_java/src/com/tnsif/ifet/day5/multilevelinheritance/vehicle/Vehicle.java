package com.tnsif.ifet.day5.multilevelinheritance.vehicle;

public class Vehicle {
	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		BMW m=new BMW();
		m.vehicleType();
		m.brand();
		m.speed();
		
		BMWm2 m1=new BMWm2();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
		
	}

}
