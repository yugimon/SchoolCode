public class GettingIndividualDigits
{
	public static void main( String[] args )
	{
		
			for( int w=1 ; w<=9 ; w++)
			{
				for( int e=0 ; e <10; e++ )
				{
					
					int q = w+e;
					int we = 10*w + 1*e;
					System.out.println(we+", "+w+"+"+e+" = "+q);	
				}
				
			}
					
							
	}
}