package oopsAssignment;

public class Student {
	    String name;
	    int rollNo;
	    int mark;

	    void display() {
	        System.out.println(name + " " + rollNo + " " + mark);
	    }

	    public static void main(String[] args) {
	        Student s1 = new Student();
	        s1.name = "Venky";
	        s1.rollNo = 101;
	        s1.mark = 90;

	        Student s2 = new Student();
	        s2.name = "Ravi";
	        s2.rollNo = 102;
	        s2.mark = 85;

	        s1.display();
	        s2.display();
	    }
	}

