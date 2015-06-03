//234168

public class Euler001
{
	public static void main( String[] args )
	{
		int t =0;
		for (int z=0;z <= 1000;z++)
		{
			if ( z %3 == 0 || z %5 == 0)
			{
				t = t+z;
			}
		}
		System.out.println(t);
	
	}
}