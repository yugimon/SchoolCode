import java.util.Scanner;
import java.io.File;

public class DisplayingAFile
{
	public static void main( String[] args ) throws Exception
	{
		String a, file = ".txt";
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Open which file: ");
		file = kb.next();
		Scanner fileIn = new Scanner(new File(file));
		while( fileIn.hasNext() )
		{
			a = fileIn.nextLine();
			System.out.println(a);
		}
		
		fileIn.close();
	}
}