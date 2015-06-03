import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class HighScore
{
	public static void main( String[] args ) throws Exception
	{
		String score, name;
		PrintWriter fo;
		
		fo = new PrintWriter( new FileWriter("score.txt") );
		Scanner kb = new Scanner(System.in);
		
		System.out.println("You got a high score!");
		System.out.println();
		System.out.print("Please enter your score: ");
		score = kb.next();
		System.out.print("Please enter your name: ");
		name = kb.next();
		
		fo.println("Score: "+score);
		fo.println("Name: "+name);
		fo.close();
		System.out.println("Data stored into score.txt.");
	}
}