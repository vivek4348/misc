package com.home;

public class RunnableImpl extends NotifyingThread {

	public void doRun() {
		Thread currentThread = Thread.currentThread();
		System.out.println("Thread Started "+ currentThread.getName());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Thread Ended "+ currentThread.getName());
	}

}
