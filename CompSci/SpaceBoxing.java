import java.util.Scanner;

public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double e0, v1, m2, j3, s4, u5, n6;
		int planet;

		System.out.print( "Please enter your current earth weight: " );
		e0 = keyboard.nextDouble();

		System.out.println( "I have information for the following planets:" );
		System.out.println( "\t1. Venus   2. Mars    3.Jupiter" );
		System.out.println( "\t4. saturn  5. Uranus  6.Neptune" );

		v1 = e0 * 0.78;
		m2 = e0 * 0.39;
		j3 = e0 * 2.65;
		s4 = e0 * 1.17;
		u5 = e0 * 1.05;
		n6 = e0 * 1.23;

		System.out.print( "Which planet are you visiting? " );
		planet = keyboard.nextInt();

		if ( planet == 1 )
		{
			System.out.println( "Your weight would be " + v1 + " pounds on that planet." );
		}
		if ( planet == 2 )
		{
			System.out.println( "Your weight would be " + m2 + " pounds on that planet." );
		}
		if ( planet == 3 )
		{
			System.out.println( "Your weight would be " + j3 + " pounds on that planet." );
		}
		if ( planet == 4 )
		{
			System.out.println( "Your weight would be " + s4 + " pounds on that planet." );
		}
		if ( planet == 5 )
		{
			System.out.println( "Your weight would be " + u5 + " pounds on that planet." );
		}
		if ( planet == 6 )
		{
			System.out.println( "Your weight would be " + n6 + " pounds on that planet." );
		}
	}
}