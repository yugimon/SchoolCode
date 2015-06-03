//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;
import static java.lang.Math.*;

public class Aplus05DistanceRunner
{
	public static void main( String[] args )
	{

		Aplus05Distance test = new Aplus05Distance();
		test.setCoordinates(3, -2, -5, -3);
		out.println(test.toString());
		
		test.setCoordinates(5,5 ,1 ,2 );
		out.println(test.toString());
		
		test.setCoordinates(9 ,9,8 ,8 );
		out.println(test.toString());
		
		test.setCoordinates( 8,8,9 ,9 );
		out.println(test.toString());
		
		//add more test cases
	}
}
