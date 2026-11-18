package lambda;
import java.util.*;
public class Stringname {
 public static void main(String args[])
 {
	 Scanner a=new Scanner(System.in);
	 System.out.println("enter the String:");
	 String b=a.nextLine();
	 System.out.println("uppercase:" +b.toUpperCase());
	 System.out.println("lowercase:" +b.toLowerCase());
	 System.out.println("length:" +b.length());
	 String reverse = "";

     for (int i = b.length() - 1; i >= 0; i--) {
         reverse = reverse + b.charAt(i);
     }

     System.out.println("Reverse: " + reverse);


     if (b.equalsIgnoreCase(reverse)) {
         System.out.println("Palindrome: Yes");
     } else {
         System.out.println("Palindrome: No");
     }

     // Count vowels
     int count = 0;

     for (int i = 0; i < b.length(); i++) {
         char ch = Character.toLowerCase(b.charAt(i));

         if (ch == 'a' || ch == 'e' || ch == 'i' ||
             ch == 'o' || ch == 'u') {
             count++;
         }
     }

     System.out.println("Vowels: " + count);

     a.close();
	 
	 
	 
	 
 }
}
