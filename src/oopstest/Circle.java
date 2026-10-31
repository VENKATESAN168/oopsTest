package oopstest;

public class Circle extends ShapeAbstraction{
	 double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    double calculateArea() {
	        return Math.PI * radius * radius;
	    }
}
