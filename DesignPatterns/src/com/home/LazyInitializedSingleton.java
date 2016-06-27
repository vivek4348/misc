package com.home;

import java.io.IOException;

/*  If we dont mark the singletonInstance with "volatile" keyword
 *  Program checks the value of instance once again within the synchronized block but the JIT compiler 
 *  can rearrange the bytecode in a way that the reference to instance is set before the constructor has finished its execution.
This means the method getInstance() returns an object that may not have been initialized completely.

I think, the keyword volatile can be used for the instance variable. 
Variables that are marked as volatile get only visible to other threads once the constructor of the object has finished its execution completely.

 * 
 */

public class LazyInitializedSingleton {
	  private static volatile  LazyInitializedSingleton singletonInstance; // 1. private static volatile singleton variable
	  //the volatile modifier guarantees that any thread that reads a field will see the most recently written value.

	  public static LazyInitializedSingleton getInstance(int id)throws IOException { //2. Expose Static method returning singleton variable 
		  if (singletonInstance == null) {
		      synchronized (LazyInitializedSingleton.class) {
		        if (singletonInstance == null)
		        	singletonInstance = new LazyInitializedSingleton(id);
		      }
		    }
		    return singletonInstance; 
	  }

	  private LazyInitializedSingleton(int id) {} //3. private Constructor
	}

