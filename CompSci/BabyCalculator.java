import java.util.Scanner;

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;
		Boolean d = true;

		do
		{
			System.out.print("> ");
			a  = keyboard.next();
			op = keyboard.next();
			b  = keyboard.next();
			
			if()
			{
			
				if ( op.equals("+") )
					c = a + b;
				else if ( op.equals("-") )
					c = a - b;
				else if ( op.equals("*") )
					c = a * b;
				else if ( op.equals("/") )
					c = a / b;
				else if ( op.equals("^") )
					c = power(a,b);
				else
				{
					System.out.println("Undefined operator: '" + op + "'.");
					c = 0;
				}
			if ( a.equals("quit"))
			{
				System.out.println("Bye, now.");
				d = false;
			}
			else
				System.out.println(c);

		} while ( d );
	}
	public static double power(double a, double b)
	{
		double r = 1;
		for(int w = 1; w <= b; w++)
		{
			
			r = r * a;
		}
		return r;
	}
}

