package com.example;

import java.util.LinkedList;
import java.util.List;

public class SampleService {
	
	static List<String> stringList;
	
	static {
		stringList = new LinkedList<String>(); // One Mistake
	}
	
	public void callMethod(String string) throws InterruptedException {
		Thread.sleep(1000);
		stringList.add(string);
		callWS(stringList);
		
	}

	private void callWS(List<String> stringList2) {
		stringList2.add("Anand");
		
	}

}
