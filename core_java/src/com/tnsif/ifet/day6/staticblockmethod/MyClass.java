package com.tnsif.ifet.day6.staticblockmethod;

public class MyClass {
	private static int sec ; 
	private static int srNo;

	static
	{
		System.out.println("-----------Static Block---------");
		srNo=100;
		sec=10;
	}

	MyClass()
	{
		System.out.println("--------------Default Constructor-----------");
		srNo++;
		sec++;		
	}
	
	@Override
	public String toString() {
		return "Class [Serial No "+srNo+", Section=" + sec + "]";
	}
	static void display() 
	{
		System.out.println("Serial No. "+srNo); 
	}

}
