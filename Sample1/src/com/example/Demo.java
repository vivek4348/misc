package com.example;

import java.util.LinkedList;
import java.util.List;

public class Demo {
	static int count = 0;
	static List<String> stringList = null;
	
	static {
		stringList = new LinkedList<String>();
	}
	
	Demo() {
		 while(count < 10) new Demo(++count);
		}
	public Demo(int i) {
	  super();
	}
public static void main(String a1[]) {
     /* B b = (B) new B(); // compiles with the cast, 
                         // but runtime exception - java.lang.ClassCastException
  
	A a = new A();  
	
	
	if(a instanceof B) {
		B b = (B) a;
		System.out.println("a is instance of B");
	} else {
		
		System.out.println("a is not instance of B");
	}
	
	String name = null;
	int i1 = 10;
	int i2 = 4;
	name = (i1>i2)? "Manvi":"Kirthi";
	System.out.println(name);
	
	boolean b1 = (i1>i2);
	boolean b2 = (i1> (i2 + 20));
	
	System.out.println(b1&b2);*/
	
  
  }
}

class A {
  public void draw() {
    System.out.println("1");
  }

  public void draw1() {
    System.out.println("2");
  }
}

class B extends A {
  public void draw() {
    System.out.println("3");
  }
  public void draw2() {
    System.out.println("4");
  }
}