package conditionlogic.copy;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("enter the year:");
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		if(n%400==0 || (n%4==0  && n%400!=0))
				{
			      System.out.println("leap year:"+n);			
			      }
		else
		{
			System.out.println("not leap year:"+n);
		}
     a.close();
	}

}
