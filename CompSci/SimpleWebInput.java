import java.net.URL;
import java.util.Scanner;

public class SimpleWebInput
{
	public static void main(String[] args) throws Exception
	{
		String url = "http", a; 
		Scanner kb = new Scanner(System.in);
		System.out.print("Open which url: ");
		url = kb.next();
			
		URL mcool = new URL(url);
		Scanner webIn = new Scanner( mcool.openStream() );
		
		while( webIn.hasNext() )
		{
			a = webIn.nextLine();
			System.out.println(a);
		}
		
		webIn.close();
		
	}
}