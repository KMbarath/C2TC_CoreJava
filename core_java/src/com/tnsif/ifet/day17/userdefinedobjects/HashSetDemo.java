package com.tnsif.ifet.day17.userdefinedobjects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	public static void main(String args[]) {
		Set<Student> studentSet = new HashSet<Student>();
		addElements(studentSet);
		System.out.println(studentSet);		
	}

	static void addElements(Set<Student> studentSet) {

		Student s1 = new Student("Barath",78);
		studentSet.add(s1);
		s1 = new Student("Ashwin",66);
		studentSet.add(s1);
		s1 = new Student( "Kesavan",73);
		studentSet.add(s1);
		s1 = new Student("Rex",81);
		studentSet.add(s1);
		s1 = new Student("Sathish",81); 
		studentSet.add(s1); //duplicate element can't insert

	}

}
