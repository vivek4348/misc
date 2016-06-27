package com.test;

import com.home.Counter;
import com.home.IncrementerThread;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter(); // the shared object
		Thread t1 = new IncrementerThread(counter);
		Thread t2 = new IncrementerThread(counter);
		t1.start(); // thread 1 increments the count by 10000
		t2.start(); // thread 2 increments the count by 10000
		t1.join(); // wait for thread 1 to finish
		t2.join(); // wait for thread 2 to finish
		System.out.println(counter.getValue()); // rarely 20000
		// lowest 11972
	}

}
