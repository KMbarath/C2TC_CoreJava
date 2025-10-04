package com.tnsif.ifet.day8.interfaces.functionalinterface;

public class FuctionalInterface {
	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		GreetInterface g1 = () -> {
			return "Good Morning";
		};

		System.out.println(g1.greet());

	}

}
