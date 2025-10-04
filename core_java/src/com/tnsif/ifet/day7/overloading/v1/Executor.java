package com.tnsif.ifet.day7.overloading.v1;

public class Executor {
	public static void main(String[] args) {

		System.out.println("Is 121 Palindrome? "+Operation.isPalindrome(121));
		System.out.println("Is 123 Palindrome? "+Operation.isPalindrome(12321));
		
		System.out.println("Is CAR Palindrome? "+Operation.isPalindrome("BARATH"));
		System.out.println("Is RACECAR Palindrome? "+Operation.isPalindrome("LEVEL"));

	}

}
