public class NumberPuzzles1
{
	public static void main( String[] args )
	{
		for( int z=0 ; z<=60 ; z++)
			for( int x=0;x<=60; x++)
				if(z+x==60 && z-x==14)
					System.out.println(z + " " + x);
	}
}