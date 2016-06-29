package com.test;

import com.home.RunnableImpl;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable = new RunnableImpl();
		
		Thread t1 = new Thread(runnable, "t1");
		Thread t2 = new Thread(runnable, "t2");
		Thread t3 = new Thread(runnable, "t3");
		
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}
