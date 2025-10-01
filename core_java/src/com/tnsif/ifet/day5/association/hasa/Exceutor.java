package com.tnsif.ifet.day5.association.hasa;

public class Exceutor {
	public static void main(String[] args) {
		Address address = new Address("No:4,J.J.Nagar", "Villupuram", "Tamil Nadu",", 605401");
		Person person = new Person("Barath", address);
		person.displayInfo();
	}

}
