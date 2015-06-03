public class GettingIndividualDigits
{
	public static void main( String[] args )
	{
		for( int z=1; z<=9; z++)
		{
			for(int x=0; x<=9; x++)
			{
				int c = z+x;
				int zx = 10*z + 1*x;
				System.out.println(zx+", "+z+"+"+x+" = "+c);
			}
		}
	}
}