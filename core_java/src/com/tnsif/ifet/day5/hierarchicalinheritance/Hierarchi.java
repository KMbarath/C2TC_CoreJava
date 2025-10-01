package com.tnsif.ifet.day5.hierarchicalinheritance;

public class Hierarchi {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Barath", "Salem");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Nikhil", "Chennai", 04, 94000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Ashwin", "Villupuram", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}
