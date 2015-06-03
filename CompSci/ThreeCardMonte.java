import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int g, c = 1 + r.nextInt(3);

		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.");
		System.out.println();
		System.out.println("Which one is the ace?");
		System.out.println("\t##  ##  ##");
		System.out.println("\t##  ##  ##");
		System.out.println("\t##  ##  ##");
		System.out.println("\t1   2   3 ");
		System.out.println();
		System.out.print("> ");
		g = keyboard.nextInt();
		System.out.println();

		if (g == c)
		{
			System.out.println("You got it! Fast Eddie reluctantly hands over you cash, scowling.");
			System.out.println();
			if (c == 1)
			{
				System.out.println("\tAA  ##  ##");
				System.out.println("\tAA  ##  ##");
				System.out.println("\tAA  ##  ##");
				System.out.println("\t1   2   3 ");
			}
			else if (c == 2)
			{
				System.out.println("\t##  AA  ##");
				System.out.println("\t##  AA  ##");
				System.out.println("\t##  AA  ##");
				System.out.println("\t1   2   3 ");
			}
			else if (c == 3)
			{
				System.out.println("\t##  ##  AA");
				System.out.println("\t##  ##  AA");
				System.out.println("\t##  ##  AA");
				System.out.println("\t1   2   3 ");
			}
		}
		else if (g != c)
		{
			System.out.println("Ha! Fast Eddie wins agian! The ace was number " + c + ".");
			System.out.println();
			{
				if (c == 1)
				{
					System.out.println("\tAA  ##  ##");
					System.out.println("\tAA  ##  ##");
					System.out.println("\tAA  ##  ##");
					System.out.println("\t1   2   3 ");
				}
				else if (c == 2)
				{
					System.out.println("\t##  AA  ##");
					System.out.println("\t##  AA  ##");
					System.out.println("\t##  AA  ##");
					System.out.println("\t1   2   3 ");
				}
				else if (c == 3)
				{
					System.out.println("\t##  ##  AA");
					System.out.println("\t##  ##  AA");
					System.out.println("\t##  ##  AA");
					System.out.println("\t1   2   3 ");
				}
			}
		}
		else
			System.out.println("The cops pull up and Fast Eddie bolts, taking your money with him.");
	}
}