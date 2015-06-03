
public class FindingPrimeNumbers
{
	public static void main( String[] args )
	{
		for( int n = 1 ; n <= 100 ; n++ )
		{
			System.out.print(n + " ");
			if (isPrime(n) == true)
				System.out.print("<");
			System.out.println();
		}
	}
	public static boolean isPrime( int n )
	{
		boolean ie = true;
		for (int t = 2; t < n; t++)
		{
			if (n%t == 0)
				ie = false;
		}
		if (n == 1)
				ie = false;
		return ie;
		
	}
}