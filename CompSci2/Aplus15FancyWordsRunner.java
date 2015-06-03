//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Aplus15FancyWordsRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner fileIn = new Scanner(new File("fancywords.dat"));
		int k = fileIn.nextInt();
		fileIn.nextLine(); // munch the newline
		for(int i = 0; i < k; i++)
		{
			Aplus15WordSort w = new Aplus15WordSort(fileIn.nextLine());
			System.out.print(w.toString());
		}
		fileIn.close();
		
	}
}
