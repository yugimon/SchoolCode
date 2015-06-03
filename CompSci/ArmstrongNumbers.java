public class ArmstrongNumbers
{
	public static void main( String[] args )
	{
		for( int q=1 ; q<=9 ; q++ )
			for( int w=0 ; w<=9; w++ )
				for( int e=0 ; e<=9; e++)
				{
					int ewq =(q*q*q)+(w*w*w)+(e*e*e);
					int qwe = 100*q + 10*w + 1*e;
					if(ewq == qwe)
						System.out.println(qwe);
				}
	}
}