
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {
	public final static void main(String args[]) {

		/*testAddInArrayList();

		testAddInCopyOnWriteArrayList();

		testRemoveUsingIteratorOfArrayList();
		
		testRemoveWithoutUsingIteratorOfArrayList();*/
		
		testHashMap();
	}

	private static void testHashMap() {
		HashMap m = new HashMap();
		
		for(int i = 1; i<=20; i++) {
			m.put(i, "India");
		}
		
		m.forEach((k, v) -> System.out.println(k + ": " + v));
	}

	private static void testRemoveUsingIteratorOfArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("vivek");
		list.add("kumar");
		
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		
		System.out.println("After modification:");
		
		list.forEach(name -> System.out.println(name));
		
	}
	
	private static void testRemoveWithoutUsingIteratorOfArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("vivek");
		list.add("kumar");
		list.add("Anannd");
		
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			String name = i.next();			
			if(name.equalsIgnoreCase("kumar")){
				list.remove(name);
			}
			System.out.println(name);			
		}
		
		System.out.println("After modification:");
		Iterator<String> i2 = list.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
			
		}
	}

	private static void testAddInCopyOnWriteArrayList() {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("vivek");
		list.add("kumar");
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			list.add("abhishek");
		}
		System.out.println("List Contents After modification:");
		Iterator<String> i2 = list.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

	private static void testAddInArrayList() {
		List<String> list = new ArrayList<String>();
		list.add("vivek");
		list.add("kumar");

		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			list.add("abhishek");
		}
	}

}