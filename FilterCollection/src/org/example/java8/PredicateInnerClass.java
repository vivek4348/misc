package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;

public class PredicateInnerClass {
	public static void main(String args[]){
		 
		List<Person> personList = new ArrayList<>();
 
		personList.add(new Person("Joe", 48));
		personList.add(new Person("Mary", 30));
		personList.add(new Person("Mike", 73));
		
		Predicate<Person> peopleOlderThan40 = new Predicate<Person>() {			
			public boolean test(Person person) {
				return (person.getAge()<40);
			}
		};
		
		/*for (Person p : personList) {
			if(predOld.test(p)) {
				System.out.println(p);
			}
		}*/
		
		personList.forEach((p) -> {if(peopleOlderThan40.test(p)) { System.out.println(p); } });
		
	}
}
