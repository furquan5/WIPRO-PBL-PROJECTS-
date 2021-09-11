package com.wipro.automobile.ship;

public class Compartment {
	private double width;
	private double height;
	private double breadth;
	public Compartment(double width,double height,double breadth) {
		this.width=width;
		this.height=height;
		this.breadth=breadth;
	}
	@Override
	public String toString() {
		return "Compartment[height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
}


 
}
