package com.staticnestedclass;

public class Outer6 {
	
	public static class Inner6 {
		public void go() { 
			System.out.println("hi");
		}
	}
	
	public static void test() {
		Inner6 inner6 = new Inner6();
		inner6.go();
	}
}
