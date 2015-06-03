public class MultiplicationTable
{
	public static void main( String[] args )
	{
		int q = 1;
		System.out.print("x |"+"\t");
		for ( int d=1; d<=9; d++)
		{
			System.out.print(d+"\t");
		}
		System.out.println("==+=======================================================================");
		for ( int a=1; a <= 12;a++ )
		{
			System.out.print(a+ " | \t");
			for ( int b=1; b <= 9;b++ )
			{
					
				int c = b*q;
				System.out.print(c + "\t");
				
				
			}
			q++;
			System.out.println();
		}
		

	}
}