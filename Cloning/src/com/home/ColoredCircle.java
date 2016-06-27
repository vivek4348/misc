package com.home;

public class ColoredCircle implements Cloneable {
	
	    private int centerX;
	    
	    private int centerY;
		
	    private Color color;

		public int getCenterX() {
			return centerX;
		}

		public void setCenterX(int centerX) {
			this.centerX = centerX;
		}

		public int getCenterY() {
			return centerY;
		}

		public void setCenterY(int centerY) {
			this.centerY = centerY;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}

		public ColoredCircle(int centerX, int centerY, Color color) {
			super();
			this.centerX = centerX;
			this.centerY = centerY;
			this.color = color;
		}

		@Override
		public Object clone() {
			ColoredCircle coloredCircle = null;
			try {
				coloredCircle =  (ColoredCircle) super.clone();
				// For Deep Cloning
	            coloredCircle.color = (Color) color.clone();
	        }
	        catch (CloneNotSupportedException e) {
	           System.out.println("Error While Cloning.");
	        }			
			return coloredCircle;
		}

		@Override
		public String toString() {
			return "ColoredCircle [centerX=" + centerX + ", centerY=" + centerY + ", color=" + color + "]";
		}
		
		 
	    
	    

}
