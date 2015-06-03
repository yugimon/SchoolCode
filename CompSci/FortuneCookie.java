import java.util.Random;

public class FortuneCookie
{
	public static void main( String[] args )
	{
		Random r = new Random();

		int tune = 1 + r.nextInt(6);
		int a, b, c, d, e, f;

		a = 1 + (int)(Math.random()*54);
		b = 1 + (int)(Math.random()*54);
		c = 1 + (int)(Math.random()*54);
		d = 1 + (int)(Math.random()*54);
		e = 1 + (int)(Math.random()*54);
		f = 1 + (int)(Math.random()*54);

		if ( tune == 1 )
		{
			System.out.print("Fortune cookie says: ");
			System.out.print("\"A great suprise awaits you.\"");
			System.out.println("\t" + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f);
		}
		else if ( tune == 2 )
		{
			System.out.print("Fortune cookie says: ");
			System.out.println("\"You will find a great happiness.\"");
			System.out.println("\t" + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f);
		}
		else if ( tune == 3 )
		{
			System.out.print("Fortune cookie says: ");
			System.out.println("\"Help me I'm trapped!\"");
			System.out.println("\t" + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f);
		}
		else if ( tune == 4 )
		{
			System.out.print("Fortune cookie says: ");
			System.out.println("\"Friends are the greatest treasure.\"");
			System.out.println("\t" + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f);
		}
		else if ( tune == 5 )
		{
			System.out.print("Fortune cookie says: ");
			System.out.println("\"A misfortune will fall apon you\"");
			System.out.println("\t" + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f);
		}
		else if ( tune == 6 )
		{
			System.out.print("Fortune cookie says: ");
			System.out.println("\"Smiles can light up the world.\"");
			System.out.println("\t" + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f);
		}
		else
			System.out.println("The fortune is unreadable");
	}
}