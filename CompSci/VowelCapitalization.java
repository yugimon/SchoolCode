import java.util.Scanner;
import java.io.File;

public class VowelCapitalization
{
	public static void main( String[] args ) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		String message, text;
		
		System.out.print("Open which file: ");
		text = kb.nextLine();
		System.out.println();
		
		Scanner fileIn = new Scanner(new File(text));
		message = fileIn.nextLine();
		
		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a')
			{
				letter = 'A';
			}
			else if ( letter == 'e')
			{
				letter = 'E';
			}
			else if ( letter == 'i')
			{
				letter = 'I';
			}
			else if ( letter == 'o')
			{
				letter = 'O';
			}
			else if ( letter == 'u')
			{
				letter = 'U';
			}
			System.out.print(letter);
		
		}
		System.out.println();
		fileIn.close();
	}
}