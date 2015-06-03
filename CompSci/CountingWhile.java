import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int n = 0, m, b;
		System.out.print("How many times? ");
		m = keyboard.nextInt();
		b = n*10;
		while ( n < m )
		{
				System.out.println( (b+10) + ". " + message );
				n++; //it adds one to n
				b = n*10;
		}
	}
}