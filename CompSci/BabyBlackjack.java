
public class BabyBlackjack
{
	public static void main( String[] args )
	{
		int a, b, ab, c, d, cd;
		a = 1 + (int)(Math.random()*10);
		b = 1 + (int)(Math.random()*10);
		ab = a + b;
		System.out.println("You drew "+a+" and "+b+".");
		System.out.println("Your total is "+ab+".");
		System.out.println();
		c = 1 + (int)(Math.random()*10);
		d = 1 + (int)(Math.random()*10);
		cd = c + d;
		System.out.println("The dealer drew "+c+" and "+d+".");
		System.out.println("Dealer's total is "+cd+".");
		System.out.println();
		if ( ab > cd )
			System.out.println("YOU WIN!");
		else if ( ab < cd )
			System.out.println("YOU LOSE!");
		else if ( ab == cd )
			System.out.println("IT'S A TIE!");
		
	}
}