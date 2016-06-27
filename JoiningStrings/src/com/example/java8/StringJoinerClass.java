package com.example.java8;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {
	
	public static void main(String[] args) {
		
//		Creating a StringJoiner

		
//		Merging StringJoiner instances

		
//		Working with collections
		Set<String> set = new TreeSet<>();
		set.add("California");
		set.add("Oregon");
		set.add("Washington");
		StringJoiner setStringJoiner = new StringJoiner(" and ");		
		set.forEach( s -> setStringJoiner.add(s));
		System.out.println(setStringJoiner);
	}
	
}
