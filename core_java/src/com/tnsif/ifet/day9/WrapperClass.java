package com.tnsif.ifet.day9;

public class WrapperClass {
    public static void main(String[] args) {
        // Boxing (recommended)
        Integer i = Integer.valueOf(10);
        System.out.println("Boxed Integer: " + i);

        // Unboxing
        int b = i.intValue();
        System.out.println("Unboxed using intValue(): " + b);

        // Auto-unboxing
        int c = i;
        System.out.println("Auto-unboxed: " + c);

        // Autoboxing
        int a = 100;
        Integer i1 = a;
        System.out.println("Autoboxed Integer: " + i1);
    }
}
