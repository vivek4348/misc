import java.io.IOException;
import java.util.ArrayList;

public class TestMain2 {
	public static void main(String[] args) throws IOException {
		/*ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");*/
		
		A a1 = new A(1);
		A a2 = new A(2);
		A a3 = new A(3);
		
		B b1 = new B(1);
		B b2 = new B(2);
		B b3 = new B(3);
		
		
		
		ArrayList<A> al = new ArrayList<A>();
		al.add(a1);
		al.add(a2);
		al.add(a3);		
			
		accept(al);
		
		ArrayList<B> bl = new ArrayList<B>();
		bl.add(b1);
		bl.add(b2);
		bl.add(b3);		
			
		accept(bl);
	}
 
	/*public static void accept(ArrayList<Object> al){
		for(Object o: al)
			System.out.println(o);
	}*/
	
	public static void accept(ArrayList<? extends A> al){
		for(Object o: al)
			System.out.println(o);
	}
}