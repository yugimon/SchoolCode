//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus04FirstRunner
{
	public static void main ( String[] args )
	{
		Aplus04FirstAndLast demo = new Aplus04FirstAndLast("Hello");
		System.out.println( "word :: " + demo.toString());
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		
		//add more test cases	
		
		Aplus04FirstAndLast dem = new Aplus04FirstAndLast("World");
		System.out.println( "word :: " + dem.toString());
		System.out.println( "first letter :: " + dem.getFirst() );
		System.out.println( "last letter :: " + dem.getLast() );
		
		Aplus04FirstAndLast de = new Aplus04FirstAndLast("JukeBox");
		System.out.println( "word :: " + de.toString());
		System.out.println( "first letter :: " + de.getFirst() );
		System.out.println( "last letter :: " + de.getLast() );
		
		Aplus04FirstAndLast d = new Aplus04FirstAndLast("TCEA");
		System.out.println( "word :: " + d.toString());
		System.out.println( "first letter :: " + d.getFirst() );
		System.out.println( "last letter :: " + d.getLast() );
		
		Aplus04FirstAndLast o = new Aplus04FirstAndLast("UIL");
		System.out.println( "word :: " + o.toString());
		System.out.println( "first letter :: " + o.getFirst() );
		System.out.println( "last letter :: " + o.getLast() );
	}
}
