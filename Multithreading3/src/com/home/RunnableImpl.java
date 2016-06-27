package com.home;

public class RunnableImpl implements Runnable {

	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println("Thread Started "+ currentThread.getName());
		
		
		for(int i=0; i<10; i++) {			
			System.out.println(currentThread.getName() + " Counter: " + i);			
		}
		try {
			System.out.println(currentThread.getName() + " Sleep is about to be called.");
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			System.out.println(currentThread.getName() + " Thread interrupted...");
			throw new RuntimeException(currentThread.getName() + " Thread interrupted..." + e);
		}
		
		System.out.println("Thread Ended "+ currentThread.getName());
	}

}
