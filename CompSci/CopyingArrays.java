
public class CopyingArrays
{
	public static void main( String[] args )
	{
		int[] arr1 = new int[10];
	
		for(int x = 0; x < arr1.length; x++)
		{
			arr1[x] = 1 + (int)(Math.random()*100);
		}
		
		int[] arr2 = new int[10];
		for (int x = 0; x < arr2.length; x++)
		{
			arr2[x] = arr1[x];
			

		}
		arr1[9] = -7;
		System.out.print("Array 1:");
		for (int x=0 ; x < arr1.length ; x++ )
	    {
	    	System.out.print(" " + arr1[x]);
     	}
     	System.out.println();
     	System.out.print("Array 2:");
		for (int x=0 ; x < arr2.length ; x++ )
	    {
	    	System.out.print(" " + arr2[x]);
     	}
     	System.out.println();
	}
}