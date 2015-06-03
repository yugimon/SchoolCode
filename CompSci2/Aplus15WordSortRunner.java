//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Arrays;
import static java.lang.System.*; 

public class Aplus15WordSortRunner
{
	public static void main(String args[])
	{
		//add test cases
		Aplus15WordSort w = new Aplus15WordSort("abc ABC 12321 fred alexander");
		w.sort();
		System.out.print(w.toString());
		
		w.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		w.sort();
		System.out.print(w.toString());
		
		w.setList("b x 4 r s y $");
		w.sort();
		System.out.print(w.toString());
		
		w.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		w.sort();
		System.out.print(w.toString());
	}
}
