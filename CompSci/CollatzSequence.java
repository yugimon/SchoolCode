import java.util.Scanner;

public class CollatzSequence
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int n, l = 0, g, t = 0;
		
		System.out.print("Starting number: ");
		n = keyboard.nextInt();
		l = n;
		System.out.print(n + "\t");
		do
		{
			
			if ( n % 2 == 0 )
			{
				n = n/2;
			}
			else
			{
				n = 3*n+1;
			}
				if ( n > l)
				{
					l = n;
				}
			System.out.print(n + "\t");
			t++;
		} while ( n != 1 );
		System.out.println();
		System.out.println();
		System.out.println("Terminated after "+t+" Steps. The largest value was "+l+".");
	}
}