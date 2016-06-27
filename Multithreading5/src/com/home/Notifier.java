package com.home;

public class Notifier implements Runnable {
	 
    private Message msg;
     
    public Notifier(Message msg) {
        this.msg = msg;
    }
 
    @Override
    public void run() {
        String nameOfCurrentThread = Thread.currentThread().getName();
        System.out.println(nameOfCurrentThread+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(nameOfCurrentThread+" Notifier work done");
                //msg.notify();
                 msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
    }
 
}