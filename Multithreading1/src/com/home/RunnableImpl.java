package com.home;

public class RunnableImpl implements Runnable {

	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println("Thread Started "+ currentThread.getName());
		
		
		for(int i=0; i<10; i++) {			
			System.out.println(currentThread.getName() + " Counter: " + i);			
		}
		
		System.out.println("Thread Ended "+ currentThread.getName());
	}

}
