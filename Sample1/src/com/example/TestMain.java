package com.example;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		
		SampleService sr = new SampleService();
		for(;;) {
			sr.callMethod("Vivek");
		}
	}

}
