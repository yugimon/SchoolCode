//233168
public class Euler001
{
	public static void main( String[] args )
	{
		int n, t=0;
		
		for (n = 1 ; n <= 999 ; n++ )
		{
			if (n%3 == 0 || n%5 == 0)
				t = n + t;
		}
		System.out.println(t);
	}
}