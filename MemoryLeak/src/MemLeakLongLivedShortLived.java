import java.util.ArrayList;
import java.util.List;

/*You can prevent memory leaks by watching for some common problems.
 * Collection classes, such as hashtables and vectors, are common places to find the cause of a memory leak. 
 This is particularly true if the class has been declared static and exists for the life of the application.
Another common problem occurs when you register a class as an event listener without bothering to unregister when the class is no longer needed. 
Also, many times member variables of a class that point to other classes simply need to be set to null at the appropriate time.
*/
public class MemLeakLongLivedShortLived {
	
	public static void main(String[] args) {
		
			MemLeakLongLivedShortLived memLeakLongLivedShortLived = new MemLeakLongLivedShortLived();
			for (;;) {
				memLeakLongLivedShortLived.startTransacton();
			}
	}
	List<String> listIDs = new ArrayList<String>();
  	  	
  	public void startTransacton() {
  		//List<String> listIDs = new ArrayList<String>();
        	String transactonID = generateUniqueTransactionID();
        	listIDs.add(transactonID);   //Keeping short lived object (transactionID) in long lived object (listIDS) causes memory leak
  	}   	
  	public String generateUniqueTransactionID() {
        	//implementation goes here
        	return "";
  	}  	
}
/*
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
at java.util.Arrays.copyOf(Arrays.java:3210)
at java.util.Arrays.copyOf(Arrays.java:3181)
at java.util.ArrayList.grow(ArrayList.java:261)
at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
at java.util.ArrayList.add(ArrayList.java:458)
at MemLeakLongLivedShortLived.startTransacton(MemLeakLongLivedShortLived.java:23)
at MemLeakLongLivedShortLived.main(MemLeakLongLivedShortLived.java:16)*/
