package com.tnsif.ifet.day7.overriding.covariant;

public class Demo {
	public static void main(String arg[])
			throws CloneNotSupportedException
		{

			Student student1 = new Student(4, "AI&DS", "Barath");
			student1.printData();

			Student student2 = (Student) student1.clone();
			student2.printData();
		}

}
