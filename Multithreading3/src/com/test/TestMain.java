package com.test;

import com.home.RunnableImpl;
// http://www.javatpoint.com/interrupting-a-thread
public class TestMain {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = new RunnableImpl();

		Thread t1 = new Thread(runnable, "t1");
		Thread t2 = new Thread(runnable, "t2");
		t1.start();

		try {
			t1.interrupt();
			
		} catch (Exception e) {
			System.out.println("Exception handled " + e);
		}

		//t2.start();
	}

}
