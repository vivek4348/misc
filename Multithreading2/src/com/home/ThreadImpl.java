package com.home;

public class ThreadImpl extends Thread {
	
	public ThreadImpl(String name) {
        super(name);
    }

	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println("Thread Started "+ currentThread.getName());
		
		
		for(int i=0; i<10; i++) {			
			System.out.println(currentThread.getName() + " Counter: " + i);			
		}
		
		System.out.println("Thread Ended "+ currentThread.getName());
	}

}
