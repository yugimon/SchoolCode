//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus11Triples
{
   private int number;

	public Aplus11Triples()
	{
		this(0);
	}

	public Aplus11Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		return 1;
	}

	public String toString()
	{
		String output="";
			for(int a = 0; a <= number-100; a++){
				for(int b = 0; b <= number-100; b++){
					for(int c = 0; c <= number-100; c++){
						if ((a*a)+(b*b)==(c*c) && greatestCommonFactor(a,b,c) <= 1){
							output += a+" " +b+" "+c+"\n";
						}
					}
				}
			}
		return output+"\n";
	}
}
