package lambda;
interface Calculator
{
	int calculate(int a, int b);
}

public class calciii {
public static void main(String args[])

{
	Calculator add = (a, b) -> a + b;
    Calculator sub = (a, b) -> a - b;
    Calculator mult = (a, b) -> a * b;
    Calculator div = (a, b) -> a / b;
	
	System.out.println(add.calculate(10,20));
	System.out.println(sub.calculate(10,20));
	System.out.println(mult.calculate(10,20));
	System.out.println(div.calculate(10,20));
	
}
}
