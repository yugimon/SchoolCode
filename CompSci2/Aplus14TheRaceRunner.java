//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus14TheRaceRunner
{
	public static void main( String args[] )
	{
		Aplus14TheRace  r = new Aplus14TheRace();
		System.out.println( r );
		while( r.turn() )
		{
			System.out.println( r ); 
		}
		System.out.println( r.getWinner() );
		
	}
}
