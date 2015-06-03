public class ThereAndBackAgain
{
	public static void main( String[] args )
	{
		System.out.println( "Here." );
		erebor(); //not a statment error
		System.out.println( "Back the first time." );
		//erebor(); //it wont print the second "there"
		System.out.println( "Back the second time." );
	}
	
	public static void erebor()
	{
		System.out.println( "There." );
	}
}