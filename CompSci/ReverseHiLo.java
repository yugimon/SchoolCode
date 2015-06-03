import java.util.Scanner;

public class ReverseHiLo
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int lo = 1, hi = 1000, guess;
		String awn = "t";
		
		
		System.out.println("Think of a number from 1 to 1000. I'll try to guess it.");
		
		while ( !awn.equals("c"))
		{
			guess = ( lo + hi ) / 2;
			System.out.println("My guess is " + guess + ". Am I too (h)igh, too (l)ow, or (c)orrect?");
			System.out.print("> ");
			awn = keyboard.next();
			if ( awn.equals("h"))
				hi = guess;
			else if ( awn.equals("l"))
				lo = guess;
		}
		System.out.println();
		System.out.println("Ha! I am the greatest guesser in the WORLD!");
	}
}