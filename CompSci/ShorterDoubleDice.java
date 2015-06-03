import java.util.Random;

public class DiceDoubles
{
	public static void main( String[] args )
	{
		Random r = new Random();
		int a, b, c;

		System.out.println("HERE COME THE DICE!" );
		System.out.println();

		a = 1 + r.nextInt(6);
		b = 1 + r.nextInt(6);
		c = a + b;

		do
		{
			a = 1 + r.nextInt(6);	
			System.out.println("Roll #1: " + a);
			b = 1 + r.nextInt(6);
			System.out.println("Roll #2: " + b);
			c = a + b;
			System.out.println("The total is " + c + "!");
		} while ( a != b );
	}
}