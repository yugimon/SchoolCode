import java.util.Scanner;

public class HowManyTimes
{
	public static void main( String[] args ) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		int a = 0,c=0, e = 0,q = 0;
		System.out.print("Array: ");
		int[] arr1 = new int[10];
		for( int x = 0; x < arr1.length; x++)
		{
			
			arr1[x] = 1 + (int)(Math.random()*50);
			System.out.print(arr1[x]+" ");
			
		}
		System.out.println();
		System.out.print("Value to find: ");
		e = kb.nextInt();
		System.out.println();
		
		for(int x = 0; x < arr1.length; x++)
		{
			if(e == arr1[x])
			{
				q++;
			}
			
		}
		System.out.println(e +" is in the array " + q +" times.");
		
	}
}