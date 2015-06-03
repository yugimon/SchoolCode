//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus11TriangleFive
{
   private char letter;
   private int amount;

	public Aplus11TriangleFive()
	{
		letter = ' ';
		amount = 0;
	}

	public Aplus11TriangleFive(char c, int amt)
	{
		letter = c;
		 amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output= "";
		int k = 0;
		for (int l = amount; l > 0; l--){
			for(int i = l, m = amount; i > 0; m--, i--){
				for( int j = m; j > 0; j--){
					if (letter + k > 'Z')
						k -= 26;
					output += (char)(letter + k);
					
					
				}
				k++;
				output += " ";
				
			}
			output += "\n";
			k = 0;
		}
		return output;
	}
}
