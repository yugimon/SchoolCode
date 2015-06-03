
public class LocatingLargest
{
	public static void main( String[] args ) throws Exception
	{
		int  e = 0,b=0;
		System.out.print("Array: ");
		int[] arr1 = new int[10];
		for( int x = 0; x < arr1.length; x++)
		{
			
			arr1[x] = 1 + (int)(Math.random()*100);
			System.out.print(arr1[x]+" ");
			
		}
		System.out.println();
		
		for(int x = 0; x < arr1.length; x++)
		{
			if(e <= arr1[x])
			{
				e = arr1[x];
				b = x;
			}
			
		}
		System.out.println("The largest value is "+e);
		System.out.println("It is in slot "+b);
	}
}