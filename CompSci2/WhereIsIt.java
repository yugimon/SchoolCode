import java.util.Scanner;

public class WhereIsIt
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Array: [");
		int[] arr = new int[10];
		for( int z = 0; z < arr.length; z++) 
		{
			arr[z] = 1 + (int)(Math.random()*100);
			System.out.print(arr[z]+", ");
		}
		System.out.print("\b\b]");
		System.out.println();
		System.out.print("Value to find: ");
		int f = kb.nextInt();
		int c = -1;
		int t = 0;
		for( int v=0; v<arr.length; v++)
		{
			if(arr[v] == f) 
			{
				t = v;
				c++;
			}
		}
		if ( c>=0)
		{
			System.out.println(f+" is in slot "+t+".");
		}
		
		else
		{
			System.out.println(f+" is not in the array");
		}
		
	}
}