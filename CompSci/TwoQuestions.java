import java.util.Scanner;

public class TwoQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String q1, q2;

		System.out.println( "TWO QUESTIONS!" );
		System.out.println( "Think of an object, and I'll try to guess it." );
		System.out.println();
		System.out.println( "Question 1) Is it animal, vegetable, or mineral?" );
		System.out.print(">");
		q1 = keyboard.next();
		System.out.println();
		System.out.println( "Question 2) Is it bigger than a breadbox?" );
		System.out.print(">");
		q2 = keyboard.next();

		if (q1.equals("animal") )
		{
			if (q2.equals("yes") )
			{
				System.out.println( "My guess is that you are thinking of an Elephant." );
			}
			else if (q2.equals("no") )
			{
				System.out.println( "My guess is that you are thinking of a Rat." );
			}
		}
		else if (q1.equals("vegetable") )
		{
			if (q2.equals("yes") )
			{
				System.out.println( "My guess is that you are thinking of a Pumpkin." );
			}
			else if (q2.equals("no") )
			{
				System.out.println( "My guess is that you are thinking of an Eggplant." );
			}
		}
		else if (q1.equals("mineral") )
		{
			if (q2.equals("yes") )
			{
				System.out.println( "My guess is that you are thinking of a Robot." );
			}
			else if (q2.equals("no") )
			{
				System.out.println( "My guess is that you are thinking of a Cellphone." );
			}
		}
		System.out.println( "I would ask if I was right, but i don't care." );
	}
}