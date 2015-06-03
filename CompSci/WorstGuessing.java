import java.util.Scanner;

public class WorstGuessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int gess, nbr = 8;

		System.out.println( "TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.print( "I\" THKING OF A NBR FROM 1-10. TRY 2 GESS! ");
		gess = keyboard.nextInt();

		if (gess==nbr)
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + nbr + "!" );
		else
			System.out.println("WOOT!  U SUXOR!!!  I PWN JOO!!!  IT WAS " + nbr + "!" );
	}
}