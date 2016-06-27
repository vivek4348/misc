package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String args[]){
		 
		List<String> stringList = new ArrayList<String>();
		stringList.add("AAA");
		stringList.add("bbb");
		stringList.add("CCC");
		stringList.add("ddd");
		stringList.add("EEE");
 
		Collections.sort(stringList);
		System.out.println("Simple sort");

		// Traverse with for:each
		/*for(String str: strings){
			System.out.println(str);
		}*/
		
		stringList.forEach((s) -> System.out.println(s));
		
		
		Comparator<String> comp = (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		};
		Collections.sort(stringList, comp);
		
		System.out.println("Sort with comparator");

		//Traverse with iterator
		Iterator<String> i = stringList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
