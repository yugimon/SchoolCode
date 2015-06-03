import java.util.Scanner;

public class DumbCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double a, b, c, d;
		
		System.out.print( "What is your first number? " );
		a = keyboard.nextDouble();
		
		System.out.print( "What is your second number? " );
		b = keyboard.nextDouble();
		
		System.out.print( "What is your third number? " );
		c = keyboard.nextDouble();
		d = (a + b + c) / 2;
		
		System.out.println( "( " + a + " + " + b + " + " + c + " ) / 2 is... " + d );
	}
}