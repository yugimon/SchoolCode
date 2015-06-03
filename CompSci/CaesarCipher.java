import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CaesarCipher
{
	public static char shiftLetter( char c, int n )
	{
		int ch = c;
			
		if ( ! Character.isLetter(c) )
			return c;
			
		ch = ch + n;
		if ( Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z' )
			ch -= 26;
		if ( Character.isUpperCase(c) && ch < 'A' || Character.isLowerCase(c) && ch < 'a' )
			ch += 26;
			
		return (char)ch;
	}
	
	public static void main( String[] args) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		Scanner fileIn = new Scanner(new File("plaintext.txt"));
		String plaintext, cipher = "";
		int shift;
		
		
		plaintext = fileIn.nextLine();
		System.out.print("Shift (0-26): ");
		shift = keyboard.nextInt();
		
		for ( int i=0; i<plaintext.length(); i++ )
		{
			cipher += shiftLetter( plaintext.charAt(i), shift );
		}
		PrintWriter out = new PrintWriter( new FileWriter("Encrypted.txt") );
		out.println(cipher);
		out.close();
	}
}