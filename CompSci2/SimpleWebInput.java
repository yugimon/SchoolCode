import java.net.URL;
import java.util.Scanner;

public class SimpleWebInput
{
	public static void main(String[] args) throws Exception
	{
		URL mcool = new URL("http://cs.leanderisd.org/current/a/simple-web-input.html");
		Scanner webIn = new Scanner( mcool.openStream() );
	
		String one = webIn.nextLine(), two = webIn.nextLine();
		
		
		webIn.close();
		
		System.out.println(one);
		System.out.println(two);
	}
}

