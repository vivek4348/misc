import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
 
/**
 * @author Crunchify.com
 *
 */
 
public class TestMainUsingCopyOnWriteArrayList {
 
	public static void main(String[] args) {
 
		List<String> companies = new CopyOnWriteArrayList<String>();
 
		companies.add("Google");
		companies.add("Yahoo");
		companies.add("Facebook");
		companies.add("eBay");
		companies.add("Microsoft");
 
		Iterator<String> crunchifyIterator = companies.iterator(); 
		
		while (crunchifyIterator.hasNext()) {			
 
			String crunchifyString = crunchifyIterator.next();
			System.out.println(crunchifyString);
			
			// Test1: Below statement Does Not causes ConcurrentModificationException when using CopyOnWriteArrayList
			
			/*if (crunchifyString.equals("Yahoo"))
					companies.remove("Microsoft");*/
			
			// Test2: Below statement causes ConcurrentModificationException
			
			/*if (crunchifyString.equals("eBay"))
				companies.add("My Message Goes here... eBay present"); */
 
			// 
			if (crunchifyString.equals("Google"))
				companies.set(2, "Google"); 
		}
		
		System.out.println("*******************************");
		
		companies.forEach(s->System.out.println(s));
	}
	
	/*Google
	Yahoo
	Facebook // Observe Not Changed when using CopyOnWriteArrayList.
	eBay
	Microsoft
	*******************************
	Google
	Yahoo
	Google
	eBay
	Microsoft*/

 
}