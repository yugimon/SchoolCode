public class BasicArrays2
{
	public static void main( String[] args )
	{
		int[] arr = new int[10];
		int i;
		
		for ( i=0 ; i < arr.length ; i++ )
		{
			arr[i] = 1 + (int)(Math.random()*100);
			System.out.println("Slot "+i+" contains a "+arr[i]);
		}
		
	}
}