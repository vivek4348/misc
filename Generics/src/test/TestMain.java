package test;

import java.util.ArrayList;
import java.util.List;

import home.Animal;
import home.Cat;
import home.Dog;

public class TestMain {

	public static void main(String[] args)  {
		
		/*Animal animal = new Animal();
		Dog dog = new Dog();
		
		//animal.move(animal);
		dog.move(animal);
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		Animal animal2  = new Dog();
		
		dog.move(animal);
		dog.move(dog);*/
		
		Animal animal1 = new Animal();
		Animal animal2= new Animal();
		Animal animal3 = new Animal();
		
		Dog dog1 = new Dog();
		Dog dog2= new Dog();
		Dog dog3 = new Dog();
		
		Cat cat1 = new Cat();
		Cat cat2= new Cat();
		Cat cat3 = new Cat();
		
		
		/*List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(dog1);
		animalList.add(dog2);
		animalList.add(dog3);
		
		animalList.add(cat1);
		animalList.add(cat2);
		animalList.add(cat3);
		
		testAnimals(animalList);*/
		
		/*List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		testExtendsAnimals(dogList);
		
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(cat1);
		catList.add(cat2);
		catList.add(cat3);
		testExtendsAnimals(catList);*/
		
		/*List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		testSuperAnimals(dogList);  -----> VV Imp Observe !!!
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(animal1);
		animalList.add(animal2);
		animalList.add(animal3);
		testSuperAnimals(animalList);*/
		
		/*List<Cat> catList = new ArrayList<Cat>();
		catList.add(cat1);
		catList.add(cat2);
		catList.add(cat3);
		testSuperAnimals(catList);*/
		
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(animal1);
		animalList.add(animal2);
		animalList.add(animal3);
		
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(cat1);
		catList.add(cat2);
		catList.add(cat3);
		
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		testAnyAnimals(animalList);
		testAnyAnimals(catList);
		testAnyAnimals(dogList);
		
		
		
		
		

	}
	
	/*public static void testAnimals(List<Animal> animalList) {
		for(Animal animal: animalList) {
			animal.move();
		}
	}*/
	
	public static void testExtendsAnimals(List<? extends Animal> animalList) {
		for(Animal animal: animalList) {
			animal.move();
		}
	}
	
	public static void testSuperAnimals(List<? super Dog> dogList) {
		for(Object animal: dogList) {
			((Animal) animal).move();
		}
	}
	
	public static void testAnyAnimals(List<?> dogList) {
		for(Object animal: dogList) {
			((Animal) animal).move();
		}
	}

}
