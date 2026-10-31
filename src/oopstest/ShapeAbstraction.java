package oopstest;

public class ShapeAbstraction {
	    public static void main(String[] args) {
	        Circle c = new Circle(5);
	        Rectangle r = new Rectangle(10, 4);

	        System.out.printf("Circle Area: %.2f%n", c.calculateArea());
	        System.out.printf("Rectangle Area: %.2f%n", r.calculateArea());
	  
	}
}
