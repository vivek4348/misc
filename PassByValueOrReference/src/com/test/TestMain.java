package com.test;

import com.home.Balloon;

public class TestMain {

	private static Balloon baloonStatic = null;
	public static void main(String[] args) {
		
		Balloon red = new Balloon("Red"); 
        Balloon blue = new Balloon("Blue"); 
         
        swap(red, blue);
        
        
        System.out.println("red color="+red.getColor());
        System.out.println("blue color="+blue.getColor());
         
        foo(blue);
        System.out.println("blue color="+blue.getColor());
        
        System.out.println(baloonStatic);

	}
	 /* public void me1(List<String> list){
      	
	  }
	  	
	  public void me1(List<Integer> list){
	        	
	  }*/

	  
	private static void foo(Balloon balloon) { 
	        balloon.setColor("Red"); 
	        baloonStatic = new Balloon("Green"); 
	        baloonStatic.setColor("Blue"); 
	    }
	 
	    //Generic swap method
    public static void swap(Object r, Object b){
        Object temp = r;
        r=b;
        b=temp;
        System.out.println(" Inside Swap Method");
        System.out.println(r);
        System.out.println(b);
    }

}
