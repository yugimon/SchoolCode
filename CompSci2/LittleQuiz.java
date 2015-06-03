import java.util.Scanner;

public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Get ready for a quiz!");
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("\tA) Melbourne");
		System.out.println("\tB) Anchorage");
		System.out.println("\tC) Juneau");
		System.out.println();
		System.out.print(">");
		int a1 = kb.next();
		System.out.println();
		if ( a1.equals("c"))
			System.out.println("Thats right!");
		else
			System.out.println("Sorry, the answer was Juneau." );
		
	}
}