package com.tnsif.ifet.day6.staticblockmethod;

public class Class {
	public static void main(String[] args) {

		MyClass o1 = new MyClass();
		System.out.println(o1);
	
		MyClass.display();

		MyClass o2 = new MyClass();
		System.out.println(o2);
		MyClass.display();
		MyClass o3 = new MyClass();
		System.out.println(o3);
		MyClass.display();

	}

}
