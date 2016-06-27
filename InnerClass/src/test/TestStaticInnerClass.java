package test;

import com.staticnestedclass.Outer6;

public class TestStaticInnerClass {

	public static void main(String[] args) {
		Outer6.Inner6 innerFromMain = new Outer6.Inner6(); 
		innerFromMain.go();		
		Outer6.test();
		
	}
}
