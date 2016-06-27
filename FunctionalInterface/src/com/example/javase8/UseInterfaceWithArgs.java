package com.example.javase8;

public class UseInterfaceWithArgs {

	public static void main(String[] args) {
		
		InterfaceWithArgs simpleInterface = (a1, a2)-> { 
			int result = a1 + a2;
			System.out.println("Addition of two Numbers " + result);
		};
	
		simpleInterface.doSomething(10, 20);
	}
}
