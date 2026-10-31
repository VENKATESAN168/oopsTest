package oopstest;

public class Rectangle extends ShapeAbstraction {
	 double length, width;

	    Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    double calculateArea() {
	        return length * width;
	    }
}
