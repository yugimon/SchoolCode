import java.util.Scanner;

public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String a1 = "c", a2 = "no", a3 = "b", q1, q2, q3;
		int x, y, z, a;

		System.out.println( "Get ready for a quiz!" );
		System.out.println();

		 System.out.println( "Q1) What is the capital of Alaska?" );
		 System.out.println( "\t\tA) Melbourne" );
		 System.out.println( "\t\tB) Anchorage" );
		 System.out.println( "\t\tC) Juneau" );
		 System.out.println();
		 System.out.print( ">" );
		 q1 = keyboard.next();
		 System.out.println();

		 if ( q1.equals(a1) )
		 {
			 System.out.println( "That's right!" );
			 x = 1;
		 }
		 else
		 {
			 System.out.println( "Sorry, that is not the capital of Alaska." );
			 x = 0;
		 }

		 System.out.println();
		 System.out.println( "Q2) Can you store the value \"cat\" in a variable of type int (yes or no)?" );
		 System.out.println();
		 System.out.print( ">" );
		 q2 = keyboard.next();
		 System.out.println();

		 if (q2.equals(a2) )
		 {
			 System.out.println( "That's right!" );
			 y = 1;
		 }
		 else
		 {
			 System.out.println( "Sorry, \"cat\" is a string. ints can only store numbers." );
			 y = 0;
		 }

		 System.out.println();
		 System.out.println( "Q3) What is the result of 9+6/3?" );
		 System.out.println( "\t\tA) 5" );
		 System.out.println( "\t\tB) 11" );
		 System.out.println( "\t\tC) 15/3" );
		 System.out.println();
		 System.out.print( ">" );
		 q3 = keyboard.next();
		 System.out.println();

		 if (q3.equals(a3) )
		 {
			 System.out.println( "That's correct!" );
			 z = 1;
		 }
		 else
		 {
			 System.out.println( "Sorry, that is not the result of 9+6/3?" );
			 z = 0;
		 }
		 System.out.println();
		 System.out.println();

		 a = x + y + z;
		 System.out.println( "Overall, you got " + a + " out of 3 correct." );
		 System.out.println( "Thanks for playing!" );

	 }
 }