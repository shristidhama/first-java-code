package com.shristi.session3;

public class Circle {
private int radius;
//constructor is a special member of the class
//no argument
	Circle(){
		radius=5;
	}
	Circle(int r){
		radius=r;
	}
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void area() {
	 System.out.println("the area of circle is "+3.14*radius*radius);
	}

}

