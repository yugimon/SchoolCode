import java.util.Scanner;

public class ParallelArrays
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int q = 0, e;
		String[] arr1 = { "Keaster", "Arc", "Long", "Rose", "Smith" };
		Double[] arr2 = { 99.2, 69.3, 86.8, 83.4, 99.9 };
		int[] arr3 = { 812345, 234721, 912874, 523091, 100001 };
		System.out.println("Values:");
		for (int x = 0; x < arr3.length; x++)
		{
			System.out.println("\t"+arr1[x]+" "+arr2[x]+" "+arr3[x]);
		}
		System.out.println();
		System.out.print("ID number to find: ");
		e = kb.nextInt();
		for(int x = 0; x < arr3.length; x++)
		{
			if(e == arr3[x])
			{
				System.out.println("Found in slot "+x);
				q = x;
			}
			
		}
		System.out.println("\tName: "+arr1[q]);
		System.out.println("\tAverage: "+arr2[q]);
		System.out.println("\tID: "+arr3[q]);
	}
}