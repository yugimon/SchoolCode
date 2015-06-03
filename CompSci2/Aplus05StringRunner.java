//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;
import java.util.Scanner;

public class Aplus05StringRunner
{
	public static void main ( String[] args )
	{
		Aplus05StringOddOrEven test = new Aplus05StringOddOrEven();
		test.setString("cat");
		System.out.println("Word :: cat");
		System.out.println("cat"+test.toString());
		System.out.println();
		
		test.setString("boot");
		System.out.println("Word :: boot");
		System.out.println("boot"+test.toString());
		System.out.println();
		
		test.setString("it");
		System.out.println("Word :: it");
		System.out.println("it"+test.toString());
		System.out.println();
		
		test.setString("a");
		System.out.println("Word :: a");
		System.out.println("a"+test.toString());
		System.out.println();
		
		test.setString("eleven");
		System.out.println("Word :: eleven");
		System.out.println("eleven"+test.toString());
		System.out.println();
		
		test.setString("thirteen");
		System.out.println("Word :: thirteen");
		System.out.println("thirteen"+test.toString());
		System.out.println();
		
		test.setString("odd");
		System.out.println("Word :: odd");
		System.out.println("odd"+test.toString());
		System.out.println();
		
		test.setString("even");
		System.out.println("Word :: even");
		System.out.println("even"+test.toString());
		System.out.println();
		
		
	}
}
