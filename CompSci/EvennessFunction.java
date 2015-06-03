
public class EvennessFunction
{
	public static void main( String[] args )
	{
		for( int n = 1 ; n <= 20 ; n++ )
		{
			System.out.print(n + " ");
			if (isEven(n) == true)
				System.out.print("<");
			if (isDivisibleBy3(n) == true)
				System.out.print("=");
			System.out.println();
		}
	}
	public static boolean isEven( int n )
	{
		boolean ie;
		if (n%2 == 0)
			ie = true;
		else
			ie = false;
		return ie;
		
	}
	public static boolean isDivisibleBy3( int n )
	{
		boolean ie;
		if (n%3 == 0)
			ie = true;
		else
			ie = false;
		return ie;
	}
}