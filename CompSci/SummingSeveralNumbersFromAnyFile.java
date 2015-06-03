import java.util.Scanner;
import java.io.File;

public class SummingSeveralNumbersFromAnyFile
{
	public static void main(String[] args ) throws Exception
	{
		String file = ".txt";
		int	a, t = 0; 
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Which file would you like to read numbers from: ");
		file = kb.next();
		System.out.println("Reading numbers from \""+file+"\""); 
		Scanner fileIn = new Scanner(new File(file));
		while( fileIn.hasNext() )
		{
			a = fileIn.nextInt();
			t = t + a;
			System.out.print(a + " ");
			
		}
		System.out.println();
		
		fileIn.close();
		System.out.println("Total is " + t);
	}
}