package com.tnsif.ifet.day15.generics;

public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();

}
