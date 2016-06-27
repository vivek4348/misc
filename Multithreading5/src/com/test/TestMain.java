package com.test;

import com.home.Message;
import com.home.Notifier;
import com.home.Waiter;

public class TestMain {

	public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1,"Waiter1").start();
         
        Waiter waiter2 = new Waiter(msg);
        new Thread(waiter2, "Waiter2").start();
         
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        
        
        System.out.println("All the threads are started");
    }

}
