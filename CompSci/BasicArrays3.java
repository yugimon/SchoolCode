public class BasicArrays3
{
	public static void main( String[] args )
	{
		int[] arr = new int[1000];
		int i;
		
		for ( i=0 ; i < arr.length ; i++ )
		{
			arr[i] = 10 + (int)(Math.random()*90);
			System.out.print(arr[i]+ "  ");
		}
		
	}
}