
/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // The default constructor with no argument.
   // It sets the radius and color to their default value.
   public Circle() {
      radius = 1.0;
      color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double r) {
      radius = r;
      color = "red";
   }
   
// 3rd constructor to construct a new instance of Circle with the given radius and color
   public Circle(double r, String c) {
      radius = r;
      color = c;
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   // Getter for instance variable color
   public String getColor() {
	   return color; 
	   }

   // A public method for setting the radius
   public void setRadius(double r) {
     radius = r;
   }

   // A public method for setting the color
   public void setColor(String c) {
     color = c;
   }  
   /*
   // Return a description of this instance in the form of 
   // Circle[radius=r,color=c]
   public String toString() {
	   return "Circle[radius=" + radius +" color=" + color + "]";
   }
   */
   
   // A public method to calculate circumference
   public double getCircumference() {
	   return 2*radius*Math.PI;
   }
   
   public String toString() {
	   return "Circle{radius= " +radius + ", Circumference = " + getCircumference() + "]";
   }
}