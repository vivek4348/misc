package com.home;

public class Animal {
	
	static {
		System.out.println("Animal Static Initialization Block.");
	}
	
	{
		System.out.println("Animal Instance Initialization Block");
	}

	String name;
	
	
	
	public Animal() {
		System.out.println("Animal Default Consructor");
	}

	public Animal(String name) {
		System.out.println("Animal Consructor with Args.");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void born() {
		
	 System.out.println("Animal is Born");

	}
	
	private void dead() {
		
		System.out.println("Animal is Dead");

	}
}
