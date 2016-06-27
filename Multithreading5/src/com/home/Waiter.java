package com.home;

public class Waiter implements Runnable{
     
    private Message msg;
     
    public Waiter(Message m){
        this.msg=m;
    }
 
    @Override
    public void run() {
        String nameOfCurrentThread = Thread.currentThread().getName();
        synchronized (msg) {
            try{
                System.out.println(nameOfCurrentThread+" waiting to get notified at time: "+System.currentTimeMillis());
                msg.wait(); 
                // To Process the Message Object, it waits.
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(nameOfCurrentThread+" waiter thread got notified at time: "+System.currentTimeMillis());
            //process the message now
            System.out.println(nameOfCurrentThread +" processed: " + msg.getMsg());
        }
    }
 
}
