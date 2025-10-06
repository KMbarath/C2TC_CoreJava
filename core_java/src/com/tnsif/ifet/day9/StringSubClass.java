package com.tnsif.ifet.day9;

public class StringSubClass extends StringSuperClass {
    // Constructor
    public StringSubClass() {
        super();  // calls parent class constructor
    }

    public static void main(String[] args) {
        StringSubClass obj = new StringSubClass();
        String s = obj.concatStrings("Hello", "World");
        System.out.println("Concatenated: " + s);
    }

}
