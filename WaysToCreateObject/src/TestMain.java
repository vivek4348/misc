import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import sun.reflect.Reflection;

public class TestMain {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
		
		Person person1 = new Person("Person1");
		System.out.println(person1);
		
		Person person2 = (Person) Class.forName("Person").newInstance();
		
		
        
		System.out.println(person2);
		
		Person person3Temp = new Person("Person3");
		Person person3 = (Person) person3Temp.clone();
		System.out.println(person3);
		
		Person person4 = (Person) Person.class.getClassLoader().loadClass("Person").newInstance();
		System.out.println(person4);
		
		/*Class.forName() will always use the ClassLoader of the caller,
		 *  whereas ClassLoader.loadClass() can specify a different ClassLoader. 
		 *  I believe that Class.forName initializes the loaded class as well, 
		 *  whereas the ClassLoader.loadClass() approach doesn’t do that
		 *   right away (it’s not initialized until it’s used for the first time).*/
		
		
		/*// Create Object5
		// create a new file with an ObjectOutputStream
		FileOutputStream out = new FileOutputStream("crunchify.txt");
		ObjectOutputStream oout = new ObjectOutputStream(out);
		 
		// write something in the file
		oout.writeObject(object3);
		oout.flush();
		 
		// create an ObjectInputStream for the file we created before
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("crunchify.txt"));
		CrunchifyObj object5 = (CrunchifyObj) ois.readObject();*/
		
		Class clazz = Person.class;
		Constructor personConstructor1 = clazz.getDeclaredConstructors()[0];
		Constructor personConstructor2 = clazz.getDeclaredConstructors()[1];
		Person person6a = (Person) personConstructor1.newInstance();
		Person person6b = (Person) personConstructor2.newInstance("Person6b");
		System.out.println(person6a);
		System.out.println(person6b);
		
	}

}
