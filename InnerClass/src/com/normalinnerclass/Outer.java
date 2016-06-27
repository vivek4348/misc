package com.normalinnerclass;

/*
 * The only way you can access the inner class is through a live instance of the outer class!
 * To create an instance of an inner class, you must have an instance of the outer class to tie to the inner class. 
 * There are no exceptions to this rule: an inner class instance can never stand alone without a direct relationship to an instance of the outer class.
 */
public class Outer {
	private int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	// inner class definition
	public class Inner {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Outer Intance Getter Method is " + getX());
			setX(5);
			System.out.println("Outer Intance Setter Method is " + getX());
		}
	} // close inner class definition
	
	public void makeInner() {
		Inner in = new Inner(); // Make an inner class instance IN Instance Method Of Outer Class.
		in.seeOuter();
	}
}
