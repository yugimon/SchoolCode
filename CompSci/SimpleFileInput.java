import java.util.Scanner;
import java.io.File;

public class SimpleFileInput
{
	public static void main( String[] args ) throws Exception
	{
		Scanner fileIn = new Scanner(new File("name.txt"));
		String name;
		
		name = fileIn.nextLine();
		fileIn.close();
		System.out.println("Using my pyschic powers (aided by reading data from the file), I have determined that your name is " + name + ".");
	}
}