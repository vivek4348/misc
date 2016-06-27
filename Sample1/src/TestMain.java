public class TestMain {

	// Static Method
	private static int add(int x, int y) {
		int c = 0;
		c = x + y;
		return c;
	}
	
	// Instance Method
	private int sub(int x, int y) {
		int c = 0;
		c = x - y;
		return c;
	}
	
	/*private String sub(int x, int y) {
		int c = 0;
		c = x - y;
		return "a";
	}*/
	
	
	public static void main(String[] args) {
		/*int sumOfTwoNumbers = add(3,8);
		System.out.println(sumOfTwoNumbers);
		
		TestMain testMain = new TestMain();
		int difference = testMain.sub(10,2); // Instance Methos are called using instance.
		System.out.println(difference);
		
		Employee e1 = new Employee(1, "Manasvi", "Kamishetty", 1000.0f);
		System.out.println(e1);
		
		e1.setFirstName("Manasvini");
		
		System.out.println(e1);
		
		e1.setLastName("Alampally");
		
		System.out.println(e1);
		
		char a = 'a';
		
		Integer i1 = new Integer(25);
		System.out.println(System.identityHashCode(i1));
		i1 = 67;
		System.out.println(System.identityHashCode(i1));*/
		
		 int value = 38;
	        widen(value);  
		
		/*Employee e1 = new Employee(1, "Manasvi", "Kamishetty", 1000.0f);
		Employee e2 = new Employee(2, "Vivek", "Kamishetty", 9000.0f);
		
		System.out.println(e1.companyName);
		System.out.println(e2.companyName);*/
		


	}
	
	private static void widen(int ... k) {
	    System.out.println("Converted to varargs: " + k[0]);
	}
	
	/*
	private static void widen(int k) {
        System.out.println("Converted to int: " + k);
	}
	
	// Widening
	private static void widen(long k) {
	        System.out.println("Converted to long: " + k);
	}

	// Var-Args
	private static void widen(int ... k) {
	    System.out.println("Converted to varargs: " + k[0]);
	}
	
	private static void widen(float k) {
	    System.out.println("Converted to float: " + k);
	}
	
	private static void widen(Integer k) {
	    System.out.println("Converted to Integer: " + k);
	}*/
	
	// Boxing
	private static void widen(Long k) {
	    System.out.println("Converted to Long: " + k);
	}

	   
	   
	
	
	

	
	
}
