public class NumberPuzzles4
{
	public static void main( String[] args )
	{
		for( int a=0 ; a<=100 ; a++ )
			for( int b=0 ; b<=100; b++ )
				for( int c=0 ; c<=100; c++ )
					for ( int d=0; d<=100; d++ )
						if (a + b + c + d == 45 && a+2==b-2 && b-2==c*2 && c*2==d/2 && d/2==a+2)
							System.out.println("A="+a+" B="+b+" C="+c+" D="+d);	
	}
}