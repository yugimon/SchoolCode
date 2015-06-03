//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus11BoxWordRunner
{
	public static void main( String args[] )
	{
		Aplus11BoxWord box = new Aplus11BoxWord("SQUARE");
		out.println(box.toString());
		
		box.setWord("BOX");
		out.println(box.toString());
		
		box.setWord("A");
		out.println(box.toString());
		
		box.setWord("IT");
		out.println(box.toString());
		
		box.setWord("TOAD");
		out.println(box.toString());
	}
}
