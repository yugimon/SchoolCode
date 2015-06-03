public class NumberPuzzles4
{
	public static void main( String[] args )
	{
		for( int z=0; z<=100;z++)
			for( int x=0; x<=100; x++)
				for( int c=0; c<=100; c++)
					for( int v=0; v<=100; v++)
						if (z+x+c+v == 45 && z+2==x-2 && x-2==c*2 && c*2==v/2 && v/2==z+2)
							System.out.println("Z="+z+" X="+x+" C="+c+" V="+v);
	}
}