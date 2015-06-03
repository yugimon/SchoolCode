public class ArmstrongNumbers
{
	public static void main( String[] args )
	{
		for( int z=1;z<=9;z++)
			for( int x=0;x<=9;x++)
				for(int c=0;c<=9;c++)
				{
					int cxz = (z*z*z)+(x*x*x)+(c*c*c);
					int zxc = 100*z+10*x+1*c;
					if(cxz == zxc)
						System.out.println(zxc);
				}
	}
}