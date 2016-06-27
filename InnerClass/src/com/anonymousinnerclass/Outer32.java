package com.anonymousinnerclass;

public class Outer32 {
	
	/* Overriding the pop() method of the superclass Outer31. This
	is the whole point of making an anonymous inner class—to override one or more
	methods of the superclass! */
		public Outer31 outer31a = new Outer31() {
			public void pop() {
				System.out.println("anonymous popcorn");
			}
		};
		
		public Outer31 outer31b = new Outer31();
	}
