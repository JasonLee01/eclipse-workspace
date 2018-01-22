// First program that I made with my own skill - little bit of pre-references though :)
// 2017 Jan 4th

public class Rectangle {
	private float length;
	private float width;
	
	//constructor without argument
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	//constructor with length and width
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	//get length
	public float getLength() {
		return this.length;
	}
	
	//set length
	public void setLength(float length) {
		this.length = length;
	}
	
	//get width
	public float getWidth() {
		return this.width;
	}
	
	//set width
	public void setWidth(float width) {
		this.width = width;
	}
	
	//get area
	public double getArea() {
		return length*width;
	}
	
	//get peri-meter
	public double getPerimeter() {
		return 2*length + 2*width;
	}
	
	//to String
	public String toString() {
		return "Rectangle[width = " + width + ",length = " + length + ", Area = " + getArea() + ", Perimeter = " + getPerimeter(); 
	}
}
