package test;

import com.normalinnerclass.Outer;

public class TestNormalInnerClass {

	public static void main(String[] args) {
		// Creating an Inner Class Object from Outside the Outer Class Instance Code
		Outer outer1 = new Outer(); 
		outer1.setX(10);
		Outer.Inner inner = outer1.new Inner(); // Or Outer.Inner inner = new Outer().new Inner();
		inner.seeOuter();
		
		Outer outer2 = new Outer();
		outer2.setX(20);
		outer2.makeInner();
		
	}
}
