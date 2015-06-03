import java.util.Scanner;


public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		for ( int i=0; i<message.length(); i++ ) 
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int vowel_count = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U' )
			{
				vowel_count++;
			}
		}

		System.out.println("\nYour message contains " + vowel_count + " vowels. Isn't that interesting?");
		
		//1.it still works with the <= but breaks the second for loop
		//2. its length is 3 and the postion of the x is 2
		//3. it breaks the second for loop.
	}
}
