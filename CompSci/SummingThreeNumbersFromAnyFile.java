import java.util.Scanner;
import java.io.File;

public class SummingThreeNumbersFromAnyFile
{
	public static void main( String[] args ) throws Exception
	{
		String file = ".txt";
		int a, b, c, sum;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("which file would you like to read numbers from: ");
		file = kb.next();
		Scanner fileIn = new Scanner(new File(file));
		System.out.println("Reading numbers from file "+file);
		System.out.println();
		a = fileIn.nextInt();
		b = fileIn.nextInt();
		c = fileIn.nextInt();
		fileIn.close();
		sum = a + b + c;
		System.out.println( a + " + " + b + " + " + c + " = " + sum );
	}
}