import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int nbr, gess;

		nbr = 1 + (int)(Math.random()*10);

		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		gess = keyboard.nextInt();
		System.out.println();

		if (gess==nbr)
				System.out.println("That's right! My secret number was " + nbr );
		else
				System.out.println("Sorry, but I was really thinking of " + nbr );
	}
}