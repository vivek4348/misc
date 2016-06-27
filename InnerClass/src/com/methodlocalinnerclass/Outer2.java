package com.methodlocalinnerclass;

/*
 * A method-local inner class can be instantiated only within the method where the inner class is defined.
 */
public class Outer2 {

	private String x = "Outer2";
	public void doStuff() {
		final String y = "local variable";
		class Inner2 {
			public void seeOuter() {
				System.out.println("Outer Class Instance Variable x is " + x);
				System.out.println("Inner Class Method Local Variable y is " + y);
			} 
		} 
		
		Inner2 mi = new Inner2(); // ******** This line must come after the Inner class with in the method.**************
		mi.seeOuter();
		
	}	 
	
}
