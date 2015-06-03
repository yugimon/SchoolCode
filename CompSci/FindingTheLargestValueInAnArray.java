
public class FindingTheLargestValueInAnArray
{
	public static void main( String[] args ) throws Exception
	{
		int a = 0,c=0, e = 0,q = 0,b=0;
		System.out.print("Array: ");
		int[] arr1 = new int[10];
		for( int x = 0; x < arr1.length; x++)
		{
			
			arr1[a] = 1 + (int)(Math.random()*100);
			System.out.print(arr1[a]+" ");
			a++;
			
		}
		System.out.println();
		
		for(int x = 0; x < arr1.length; x++)
		{
			if(e <= arr1[c])
			{
				e = arr1[c];
				
			}
			c++;
			
		}
		System.out.println("The largest value is "+e);
		
	}
}