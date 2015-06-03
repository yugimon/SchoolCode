import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int gnbr, rnbr = 1 + r.nextInt(100);

		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		System.out.print("> ");
		gnbr = keyboard.nextInt();

		if (gnbr == rnbr)
			System.out.println("You guessed it! What are the odd?!?");
		else if (gnbr < rnbr)
			System.out.println("Sorry, you are too low. I was thinking of " + rnbr + "." );
		else if (gnbr > rnbr)
			System.out.println("Sorry, you are too high. I was thinking of " + rnbr + "." );
		else
			System.out.println("I don't think that is a number?!");
	}
}