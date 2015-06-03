import java.util.Scanner;
import java.io.File;

public class LittlePuzzle
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
		for ( int i=2; i<message.length(); i += 3 ) 
		{
			char letter = message.charAt(i);
			System.out.print(letter);
		}
		System.out.println();
		fileIn.close();
	}
}