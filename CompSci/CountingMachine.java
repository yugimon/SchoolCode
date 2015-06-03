import java.util.Scanner;

public class CountingMachine
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int n, c;
		
		System.out.print( "Count to: " );
		c = keyboard.nextInt();
		
		
		for ( n = 0 ; n <= c ; n++ )
		{
			System.out.print( n + " ");
		}
		System.out.println();
	}
}