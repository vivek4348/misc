package com.test;

import com.home.Color;
import com.home.ColoredCircle;

/*Shallow copy which means when you copy the "ColoredCircle" using clone() method, 
 * the fields x and y are copied perfectly with values 
 * but field "color" is copied by reference. 
 * 
 * So, any changes you make to the color of the original object 
 * will be reflected in the copied object and vice versa. 
 * 
 * The solution for this is deep copy. 
 * 
 * (i) Change the Color class to implement "Cloneable" interface and clone() method 
 * and (ii) call the clone() method of color object inside the clone() method of the ColoredCircle object. 
 */

public class TestCloning {

	public static void main1(String[] args) {
		Color c = new Color("Red");
		ColoredCircle c1 = new ColoredCircle(200, 200, c);
		ColoredCircle c2 = (ColoredCircle) c1.clone();

		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c1);
		System.out.println(c2);

		c1.getColor().setName("Green");
		System.out.println("After Color Change...");

		System.out.println(c1);
		System.out.println(c2);

	}
	
	public static void main(String[] args) {
		Color c1 = new Color("Red");
		
		
		
		Color c2 = (Color)c1.clone();
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
