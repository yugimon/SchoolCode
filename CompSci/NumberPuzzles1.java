public class NumberPuzzles1
{
	public static void main( String[] args )
	{
		for( int q=0 ; q<=60 ; q++ )
			for( int w=0 ; w<=60; w++ )
				if(q+w==60 && q-w==14)
					System.out.println(q + " " + w);
	}
}