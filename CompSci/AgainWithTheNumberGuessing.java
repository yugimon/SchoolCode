import java.util.Scanner;

public class AgainWithTheNumberGuessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int secret, guess, tries = 1;

		secret = 1 + (int)(Math.random()*10);

		System.out.println( "Ihava chosen a number between 1 and 10. Try to guess it.");
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();

		if ( secret != guess )
		{
			do
			{
				System.out.println( "That is incorrect. Guess again." );
				System.out.print( "Your guess: " );
				guess = keyboard.nextInt();
				tries++;
			} while ( secret != guess );
		}

		System.out.println( "That's right! You're a good guesser." );
		System.out.println( "It only took you " + tries + " tries.");
	}
}