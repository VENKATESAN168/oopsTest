package lambda;
interface Student
{
    void display();
}

public class Maininterface {

  public static void main(String[] args)
	    {
	        Student s = () ->
	        {
	           System.out.println("Student Name: Anand");
	            System.out.println("Age: 22");
	            System.out.println("Department: Java");
	        };

	        s.display();
	    }
	}

