package com.home;

public class Counter {
	
	private int count;

	public void increment() {
		count++; // it's a trap!
		// a single "line" is not atomic
	}

	public int getValue() {
		return count;
	}
}
