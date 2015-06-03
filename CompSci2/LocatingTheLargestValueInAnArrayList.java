import java.util.*;

public class LocatingTheLargestValueInAnArrayList
{
	public static void main( String[] args )
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.print("Arraylist: ");
		for( int z = 0; z <10; z++) 
		{
			int x = 1 + (int)(Math.random()*100);
			arr.add(x);
		}
		System.out.println(arr);
		System.out.println();
		int c = 0, p = 0;
		for( int v=0; v<10; v++)
		{
			if(arr.get(v) >= c) {
				c = arr.get(v);
				p = v;
			}
		}
		System.out.println();
		System.out.println("The largest value is "+c+" which is in slot "+p );
	}
}