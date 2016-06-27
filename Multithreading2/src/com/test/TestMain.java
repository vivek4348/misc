package com.test;

import com.home.ThreadImpl;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		
		/*Runnable runnable = new ThreadImpl();
		
		Thread t1 = new Thread(runnable, "t1");
		Thread t2 = new Thread(runnable, "t2");
		t1.start();
		t2.start();*/
		
		Thread t1 = new ThreadImpl("t1");
		Thread t2 = new ThreadImpl("t2");
		t1.start();
		t2.start();
	}

}
