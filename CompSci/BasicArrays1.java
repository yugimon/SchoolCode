public class BasicArrays1
{
	public static void main( String[] args )
	{
		int[] arr = new int[10];
		int i;
		
		for ( i=0 ; i < arr.length ; i++ )
		{
			arr[i] = -113;
			System.out.println("Slot "+i+" contains a "+arr[i]);
		}
		
	}
}