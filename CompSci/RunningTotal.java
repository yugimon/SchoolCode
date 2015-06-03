import java.util.Scanner;

public class RunningTotal
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int  current, total = 0, newtotal;
		
		System.out.print("Type in a bunch of values and I'll add them up. ");
		System.out.println("I'll stop when you type a zero.");
		
		do
		{
			System.out.print("Value: ");
			current = keyboard.nextInt();
			newtotal = current + total;
			total = newtotal;
			System.out.println("The total so far is: " + total);
		} while ( newtotal < 20 );
		
		System.out.println("The final total is: " + total);
		
	}
}
//1. done
//2. done