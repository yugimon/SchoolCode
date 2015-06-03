public class NestingLoops
{
	public static void main( String[] args )
	{
		for ( int n=1; n <= 3; n++ )
		{
			for ( char c='A'; c <= 'E'; c++ )
			{
				System.out.println( c + " " + n );
			}
		}
		
		System.out.println("\n");
		
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.println( "(" + a + "," + b + ") " );
			}
			System.out.println();
		}
		
		System.out.println("\n");
	}
}
//1. the variable changes faster in the inner loop and the varible is controled by the inner loop
//2. it changes the order in which the variables are printed
//3. the cordinate are printed obe line at a time.
//4. the cordinate are grouped by the x cordinate.