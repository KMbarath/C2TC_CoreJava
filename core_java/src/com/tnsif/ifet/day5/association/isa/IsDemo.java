package com.tnsif.ifet.day5.association.isa;

public class IsDemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Barath", 04, "AI&DS");
		Manager manager = new Manager("BARATH", 4, "Hr", 44);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}
