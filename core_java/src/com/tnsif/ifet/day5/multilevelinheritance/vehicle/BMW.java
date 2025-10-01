package com.tnsif.ifet.day5.multilevelinheritance.vehicle;

public class BMW extends Car {
	public BMW() {
		System.out.println("Class BMW");
	}

	public void brand() {
		System.out.println("Brand: BMW");
	}
	public void speed() {
		System.out.println("Max: 150Kmph");
	}

}
