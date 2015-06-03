import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int n, f, t, b;
		
		System.out.print( "Count from: " );
		f = keyboard.nextInt();
		System.out.print( "Count to  : " );
		t = keyboard.nextInt();
		System.out.print( "Count by  : " );
		b = keyboard.nextInt();
		
		
		for ( n = f ; n <= t ; n=n+b )
		{
			System.out.print( n + " ");
		}
		System.out.println();
	}
}