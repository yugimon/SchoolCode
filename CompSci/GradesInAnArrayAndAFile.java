import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class GradesInAnArrayAndAFile
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout;
		Scanner kb = new Scanner(System.in);
		int a = 0,c = 1, e = 0;
		String q, w;
		System.out.print("Name (first last): ");
		q = kb.nextLine();
		System.out.print("Filename: ");
		w = kb.next();
		fileout = new PrintWriter( new FileWriter(w) );
		fileout.println(q);
		System.out.println("Here are your randomly-selected grades (hope you pass):");
		int[] arr1 = new int[5];
		for( int x = 0; x < arr1.length; x++)
		{
			
			arr1[a] = 1 + (int)(Math.random()*100);
			a++;
			
		}
		for(int x = 0; x < arr1.length; x++)
		{
			System.out.print("Grade "+ c +": ");
			System.out.println(arr1[e]);
			fileout.print(arr1[e] + " ");
			c++;
			e++;
		}
		fileout.close();
	}
}