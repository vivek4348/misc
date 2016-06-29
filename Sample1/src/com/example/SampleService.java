package com.example;

import java.util.LinkedList;
import java.util.List;

public class SampleService {
	
	static List<String> stringList;
	
	static {
		stringList = new LinkedList<String>(); // One Mistake
	}
	
	public void callMethod(String string) {
		stringList.add(string);
	}

}
