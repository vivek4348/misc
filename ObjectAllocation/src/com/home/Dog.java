package com.home;

public class Dog extends Animal {

	static {
		System.out.println("Dog Static Initialization  Block");
	}
	
	{
		System.out.println("Dog  Instance Initialization Block");
	}
	public Dog() {
		System.out.println("Dog Default Consructor");
		
	}

	public Dog(String name) {
		System.out.println("Dog Consructor with args.");		
	}
	
	

	
}
