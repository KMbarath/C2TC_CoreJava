package com.tnsif.ifet.day5.multilevelinheritance;

import java.util.Date;

public class MultiLevelInheritance {
	
	public static void main(String[] args) {
			Person p1 = new Person("Barath", 7878767676l, new Date(2004));
			System.out.println(p1);

			p1 = new Employee("Ashwin", 8080807070l, new Date(1999), "Sales", 45000);
			System.out.println(p1);

			p1 = new LevelOneEmployee("Rex", 9880807227l, new Date(2000), "Account", 85000, 200,
					"Signing Authority");
			System.out.println(p1);
		}
}
