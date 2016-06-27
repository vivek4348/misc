package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;

public class PredicateLambda {
	
	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		Predicate<Person> predOlder  = (p) -> p.getAge() > 40;
		Predicate<Person> predYounger  = (p) -> p.getAge() < 40;
		
		displayPeople(people, predOlder);
		displayPeople(people, predYounger);
	}

	private static void displayPeople(List<Person> people, Predicate<Person> predicate) {
		people.forEach(p -> {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		});
	}

}