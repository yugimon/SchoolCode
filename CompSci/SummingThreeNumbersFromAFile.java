import java.util.Scanner;
import java.io.File;

public class SummingThreeNumbersFromAFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner fileIn = new Scanner(new File("3nums.txt"));
		int a, b, c, sum;
		
		System.out.println("Reading numbers from file \"3nums.txt\"... done.");
		System.out.println();
		a = fileIn.nextInt();
		b = fileIn.nextInt();
		c = fileIn.nextInt();
		fileIn.close();
		sum = a + b + c;
		System.out.println( a + " + " + b + " + " + c + " = " + sum );
	}
}