public class XsAndYs
{
	public static void main( String[] args )
	{
		double x, y;
		
		System.out.println(" x       y");
		System.out.println("-----------------");
		for ( x = -10 ; x <= 10 ; x = x + .5)
		{
			y = x*x;
			System.out.println(x + "\t" + y);
		}
	}
}