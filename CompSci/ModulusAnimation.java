public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%8 == 0 )
				System.out.print(" (>'_')> \r");
			else if ( i%8 == 1 )
				System.out.print(" (^'_'^) \r");
			else if ( i%8 == 2 )
				System.out.print(" <('_'<) \r");
			else if ( i%8 == 3 )
				System.out.print(" Dance!! \r");
			else if ( i%8 == 4 )
				System.out.print(" <('_'<) \r");
			else if ( i%8 == 5 )
				System.out.print(" (^'_'^) \r");
			else if ( i%8 == 6 )
				System.out.print(" (>'_')> \r");
			else if ( i%8 == 7 )
				System.out.print(" YA!!!!! \r");

			Thread.sleep(200);
		}

	}
}
