//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus04AddRunner
{
	public static void main ( String[] args )
	{
		Aplus04AddStrings demo = new Aplus04AddStrings("hello","world");
		demo.add();
		out.println(demo);

		demo.setStrings("jim","bob");
		demo.add();
		out.println(demo);

		//add more test cases
		demo.setStrings("sally","sparrow");
		demo.add();
		out.println(demo);
		
		demo.setStrings("compooter","sciance");
		demo.add();
		out.println(demo);
		
		demo.setStrings("uil","contests");
		demo.add();
		out.println(demo);
	}	
}
