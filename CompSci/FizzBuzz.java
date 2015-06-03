public class FizzBuzz
{
	public static void main( String[] args )
	{
		int n;
		
		for ( n = 1 ; n <= 100 ; n++ )
		{
			if ( n%3 == 0 && n%5 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if ( n%3 == 0 )
			{
				System.out.println("Fiss");
			}
			else if ( n%5 == 0 )
			{
				System.out.println("Buzz");
			}
			
			else
			{
				System.out.println(n);
			}
		}
	}
}