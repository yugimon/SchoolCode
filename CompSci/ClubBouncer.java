import java.util.Scanner;

public class ClubBouncer
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age = 22;
		boolean onGuestList = false;
		double attractiveness = 7.5;
		String gender = "F";

		if ( onGuestList || age >= 21 || ( gender.equals("F") && attractiveness >= 8 ) )
		{
			System.out.println("You are allowed to enter the club.");
		}
		System.out.println( "C-C-C-COMBO DESTRUCTION" );
		else
		{
			System.out.println("You are not allowed to enter the club.");
		}
	}
}
//1. It does not compile b/c there is not an if statement after the "else"