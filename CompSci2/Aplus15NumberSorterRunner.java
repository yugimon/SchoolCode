//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Arrays;
import static java.lang.System.*; 

public class Aplus15NumberSorterRunner
{
	public static void main(String args[])
	{
		int[] cases = {567891, 901912468, 864213507, 898777, 234422};
		for( int test : cases )
		{
			int[] one = Aplus15NumberSorter.getSortedDigitArray( test );
			for(int item : one)
			{
				System.out.print(item + " ");
			}
			System.out.println();
		}
	} 
}
