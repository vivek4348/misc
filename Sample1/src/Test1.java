
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {
	public final static void main(String args[]) {

		testHashMap();
		testList();
		testSet();
	}

	private static void testHashMap() {
		Map m = new HashMap();
		
		for(int i = 1; i<=20; i++) {
			m.put(i, "India");
		}
		
		m.forEach((k, v) -> System.out.println(k + ": " + v));
	}

	private static void testList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("vivek");
		list.add("kumar");
		
		list.forEach(name -> System.out.println(name));
		
	}
	
	private static void testSet() {
		Set<String> set = new HashSet<String>();
		set.add("vivek");
		set.add("vivek");
		set.add("manasvi");
		
		set.forEach(name -> System.out.println(name));
			
		}
	}

