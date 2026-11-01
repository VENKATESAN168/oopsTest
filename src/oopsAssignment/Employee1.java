package oopsAssignment;

public class Employee1 {

	    String name = "Venky";
	    int id = 101;
	    double salary = 25000;
	}

	class Developer1 extends Employee1 {
	    String programmingLanguage = "Java";

	    void display() {
	        System.out.println(name);
	        System.out.println(id);
	        System.out.println(salary);
	        System.out.println(programmingLanguage);
	    }
	    public static void main(String[] args) {
	        Developer1 d = new Developer1();
	        d.display();
	    }
}
	

