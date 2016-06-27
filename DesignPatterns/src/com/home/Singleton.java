package com.home;

/*Early creation of resource that might not be used in the application.
The client application can’t pass any argument, so we can’t reuse it. 
For example, having a generic singleton class for database connection where client application supplies database server properties.*/
public class Singleton {
	  private static final Singleton singletonInstance = new Singleton(); // 1. private static final singleton variable

	// Runtime initialization
	// By defualt ThreadSafe
	  public static Singleton getInstance() { //2. Expose Static method returning singleton variable 
	    return singletonInstance;
	  }

	  private Singleton() {} //3. private Constructor
	}