import java.util.Scanner;
import static java.lang.System.*;

public class AgeMessages3
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;

		out.print( "Hey, what's your name? (Sorry, I keep forgetting.) " );
		name = keyboard.next();

		out.print(" Ok, " + name + ", how old are you? " );
		age = keyboard.nextInt();
		out.println();

		if ( age < 16 )
			out.println( "You can't drive, " + name + "." );
		if ( age >= 16 && age < 18 )
			out.println( "You can drive but not vote, " + name + "." );
		if ( age >= 18 && age < 25 )
			out.println( "You can vote but not rent a car, " + name + "." );
		if ( age >= 25 )
			out.println( "You can do pretty much anything, " + name + "." );
	}
}