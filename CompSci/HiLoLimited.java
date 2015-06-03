import java.util.Scanner;

public class HiLoLimited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int secret, guess, gn = 0;

		secret = 1 + (int)(Math.random()*100);

		System.out.println( "I'm thinking of a number between 1-100. You have 7 guesses." );
		System.out.print( "First Guess: " );
		guess = keyboard.nextInt();
		gn++;
		
		while ( secret != guess && gn < 7 )
		{
				if ( guess < secret )
				{
					System.out.println( "Sorry, your guess is too low. Try again." );
					System.out.print("Guess # "+ (gn+1) +": ");
					guess = keyboard.nextInt();
					gn++;
				}
				if ( guess > secret )
				{
					System.out.println( "Sorry, your guess is too high. Try again." );
					System.out.print("Guess # "+ (gn+1) +": ");
					guess = keyboard.nextInt();
					gn++;
				}
				
		}
		if ( secret == guess )
		{
			System.out.println("You guessed it! What are the odds");
		}
		else if ( gn >= 7 )
		{
		System.out.println("Sorry, you didn't guess it in 7 tries. You lose." );
		}
		
	}
}