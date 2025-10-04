package com.tnsif.ifet.day8.interfaces.markerinterface;

public class MarkerInterface {
	public static void main(String[] args) {
		Student s=new Student(04,"BARATH",12000,"JAVA");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}
