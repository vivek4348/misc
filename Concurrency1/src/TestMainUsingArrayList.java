import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
/**
 * @author Crunchify.com
 *
 */
 
public class TestMainUsingArrayList {
 
	public static void main(String[] args) {
 
		
		List<String> companies = new ArrayList<>();
 
		companies.add("Google");
		companies.add("Yahoo");
		companies.add("Facebook");
		companies.add("eBay");
		companies.add("Microsoft");
 
		Iterator<String> crunchifyIterator = companies.iterator();
 
		
		while (crunchifyIterator.hasNext()) {			
 
			String crunchifyString = crunchifyIterator.next();
			System.out.println(crunchifyString);
			// Test1: Below statement causes ConcurrentModificationException
			
			/*if (crunchifyString.equals("Yahoo"))
				// modCount = 6
				companies.remove("Microsoft");*/
			
			// Test2: Below statement causes ConcurrentModificationException
			
			/*if (crunchifyString.equals("eBay"))
				companies.add("My Message Goes here... eBay present"); */
 
			// Test2: Below change wont throw ConcurrentModificationException Reason: It doesn't change modCount variable of "companies"
			if (crunchifyString.equals("Google"))
				companies.set(2, "Google"); 
		}
		
		System.out.println("######################");
		
		companies.forEach(s->System.out.println(s));
	}
 
}

/*Google
Yahoo
Google // Observe  Changed when using ArrayList.
eBay
Microsoft
######################
Google
Yahoo
Google
eBay
Microsoft*/