//© A+ Computer Science  -  www.apluscompsci.com
//  “Whats the object-oriented way to become wealthy?”

import static java.lang.System.*;

class Aplus11BoxWord
{
   private String word;

	public Aplus11BoxWord()
	{
		word="";
	}

	public Aplus11BoxWord(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public String toString()
	{
		String output="";
		for (int i=0; i<word.length(); i++)
		{
			output += word.substring(i,i+1);
		}
		output += "\n";
		for (int q=1,e=word.length()-2 ; q<word.length()-1; q++,e--) {
			output += word.substring(q,q+1);
			for (int r=1; r <word.length()-1; r++){
				output += " ";
			}
			output += word.substring(e,e+1) + "\n";
		}
		if( word.length() > 1) {
			for (int w=word.length()-1; w>=0; w--) {
				output += word.substring(w,w+1);
			}
		}
			
		return output + "\n";
	}
}
//  Inheritance