public class MonthOffset
{
	public static int month_offset( int month )
	{
		int result;
		if (month == 1 || month == 10)
			result = 1;
		else if (month == 2 || month == 3 || month == 11)
			result = 4;
		else if (month == 4 || month == 7)
			result = 0;
		else if (month == 5)
			result = 2;
		else if (month == 6)
			result = 5;
		else if (month == 8)
			result = 3;
		else if (month == 9 || month == 12)
			result = 6;
		else
			result = -9999;
			
		
		return result;
	}


	public static void main( String[] args )
	{
		System.out.println( "Offset for month 1: " + month_offset(1) );
		System.out.println( "Offset for month 2: " + month_offset(2) );
		System.out.println( "Offset for month 3: " + month_offset(3) );
		System.out.println( "Offset for month 4: " + month_offset(4) );
		System.out.println( "Offset for month 5: " + month_offset(5) );
		System.out.println( "Offset for month 6: " + month_offset(6) );
		System.out.println( "Offset for month 7: " + month_offset(7) );
		System.out.println( "Offset for month 8: " + month_offset(8) );
		System.out.println( "Offset for month 9: " + month_offset(9) );
		System.out.println( "Offset for month 10: " + month_offset(10) );
		System.out.println( "Offset for month 11: " + month_offset(11) );
		System.out.println( "Offset for month 12: " + month_offset(12) );
		System.out.println();
		System.out.println( "Offset for month 43: " + month_offset(43) );
		System.out.println( "Offset for month 17: " + month_offset(17) );
		System.out.println( "Offset for month -1: " + month_offset(-1) );
	}


}
