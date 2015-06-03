//© A+ Computer Science  -  www.apluscompsci.com

public class QuartersRunner
{
	public static void main( String args[] )
	{
		Quarters  r = new Quarters();
		System.out.println( r );
		while( r.turns() )
		{
			System.out.println( r ); 
		}
		System.out.println( r.getWinner() );
		
	}
}
