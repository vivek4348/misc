package com.home;

public class Color implements Cloneable {
	
		private String name;

		public  String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Color(String name) {
			super();
			this.name = name;
		}
		
		public Object clone() {
			try {
	            return (Color)super.clone();
	        }
	        catch (CloneNotSupportedException e) {
	           System.out.println("Error While Cloning Color Object.");
	        }
			return null;
		}

		
		
		
	    
	}


