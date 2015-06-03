import java.util.Random;

public class Dice
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

		System.out.println("Roll #1: " + a);
		System.out.println("Roll #2: " + b);
		System.out.println("The total is " + c + "!");
	}
}